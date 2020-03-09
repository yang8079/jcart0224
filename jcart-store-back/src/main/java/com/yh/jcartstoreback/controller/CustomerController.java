package com.yh.jcartstoreback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.yh.jcartstoreback.constant.ClientExceptionConstant;
import com.yh.jcartstoreback.dto.in.*;
import com.yh.jcartstoreback.dto.out.CustomerGetProfileOutDTO;
import com.yh.jcartstoreback.dto.out.CustomerLoginOutDTO;
import com.yh.jcartstoreback.exception.ClientException;
import com.yh.jcartstoreback.po.Customer;
import com.yh.jcartstoreback.service.CustomerService;
import com.yh.jcartstoreback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;
import java.util.HashMap;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:35
 */
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private SecureRandom secureRandom;

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromEmail;

    private HashMap<String, String> emailPwdResetCodeMap = new HashMap();

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        Integer customerId = customerService.register(customerRegisterInDTO);
        return customerId;
    }

    @GetMapping("/login")
    public CustomerLoginOutDTO login(CustomerLoginInDTO customerLoginInDTO) throws ClientException {
        Customer customer = customerService.getByUsername(customerLoginInDTO.getUsername());
        if (customer == null){
            throw new ClientException(ClientExceptionConstant.CUSTOMER_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.CUSTOMER_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = customer.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(customerLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            CustomerLoginOutDTO customerLoginOutDTO = jwtUtil.issueToken(customer);
            return customerLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.CUSTOMER_PASSWORD_INVALID_ERRMSG);
        }
    }

    @GetMapping("/getProfile")
    public CustomerGetProfileOutDTO getProfile(@RequestAttribute Integer customerId){
        Customer customer = customerService.getById(customerId);
        CustomerGetProfileOutDTO customerGetProfileOutDTO = new CustomerGetProfileOutDTO();
        customerGetProfileOutDTO.setUsername(customer.getUsername());
        customerGetProfileOutDTO.setRealName(customer.getRealName());
        customerGetProfileOutDTO.setMobile(customer.getMobile());
        customerGetProfileOutDTO.setMobileVerified(customer.getMobileVerified());
        customerGetProfileOutDTO.setEmail(customer.getEmail());
        customerGetProfileOutDTO.setEmailVerified(customer.getEmailVerified());

        return customerGetProfileOutDTO;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setRealName(customerUpdateProfileInDTO.getRealName());
        customer.setMobile(customerUpdateProfileInDTO.getMobile());
        customer.setEmail(customerUpdateProfileInDTO.getEmail());
        customerService.update(customer);
    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId) throws ClientException {
        Customer customer = customerService.getById(customerId);
        String encPwdDB = customer.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(customerChangePwdInDTO.getOriginPwd().toCharArray(), encPwdDB);

        if (result.verified) {
            String newPwd = customerChangePwdInDTO.getNewPwd();
            String bcryptHashString = BCrypt.withDefaults().hashToString(12, newPwd.toCharArray());
            customer.setEncryptedPassword(bcryptHashString);
            customerService.update(customer);
        }else {
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.CUSTOMER_PASSWORD_INVALID_ERRMSG);
        }

    }

    @GetMapping("/getPwdResetCode")
    public void getPwdResetCode(@RequestParam String email) throws ClientException {
        //传进email 根据email得到客户customer
        Customer customer = customerService.getByEmail(email);
        //customer客户为空
        if (customer == null){
            //抛异常没有这个客户
            throw new ClientException(ClientExceptionConstant.CUSTOMER_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.CUSTOMER_USERNAME_NOT_EXIST_ERRMSG);
        }
        //生成一个随机码
        byte[] bytes = secureRandom.generateSeed(3);
        //转换成16进制
        String hex = DatatypeConverter.printHexBinary(bytes);
        //发送邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(email);
        message.setSubject("jcart商店端客户重置密码");
        message.setText(hex);
        //发送
        mailSender.send(message);
       //存在map里key-value
        emailPwdResetCodeMap.put(email, hex);
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO) throws ClientException {
        //拿到数据判断邮箱有没有
        String email = customerResetPwdInDTO.getEmail();
        if (email == null) {
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PWDRESET_EMAIL_NONE_ERRCODE, ClientExceptionConstant.CUSTOMER_PWDRESET_EMAIL_NONE_ERRMSG);
        }
        //拿重置码 没有报空
        String innerResetCode = emailPwdResetCodeMap.get(email);
        if (innerResetCode == null) {
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PWDRESET_INNER_RESETCODE_NONE_ERRCODE, ClientExceptionConstant.CUSTOMER_PWDRESET_INNER_RESETCODE_NONE_ERRMSG);
        }
        //那外面的重置码 没有报空
        String outerResetCode = customerResetPwdInDTO.getResetCode();
        if (outerResetCode == null) {
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PWDRESET_OUTER_RESETCODE_NONE_ERRCODE, ClientExceptionConstant.CUSTOMER_PWDRESET_OUTER_RESETCODE_NONE_ERRMSG);
        }
        //拿到的两个重置码 看看一样吗 不一样证明自己输入错了
        if (!outerResetCode.equalsIgnoreCase(innerResetCode)){
            throw new ClientException(ClientExceptionConstant.CUSTOMER_PWDRESET_RESETCODE_INVALID_ERRCODE, ClientExceptionConstant.CUSTOMER_PWDRESET_RESETCODE_INVALID_ERRMSG);
        }
        //取数据库拿
        Customer customer = customerService.getByEmail(email);
        if (customer == null){
            throw new ClientException(ClientExceptionConstant.CUSTOMER_EMAIL_NOT_EXIST_ERRCODE, ClientExceptionConstant.CUSTOMER_EMAIL_NOT_EXIST_ERRMSG);
        }
        //拿到新的密码
        String newPwd = customerResetPwdInDTO.getNewPwd();
        if (newPwd == null){
            throw new ClientException(ClientExceptionConstant.CUSTOMER_NEWPWD_NOT_EXIST_ERRCODE, ClientExceptionConstant.CUSTOMER_NEWPWD_NOT_EXIST_ERRMSG);
        }
        //加密
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, newPwd.toCharArray());
        //存到数据库
        customer.setEncryptedPassword(bcryptHashString);
        //更新接口
        customerService.update(customer);
        //重置码用过之后删除,每次都重新获取新的重置码
        emailPwdResetCodeMap.remove(email);
    }



}
