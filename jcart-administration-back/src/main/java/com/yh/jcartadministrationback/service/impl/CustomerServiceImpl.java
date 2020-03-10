package com.yh.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yh.jcartadministrationback.dao.CustomerMapper;
import com.yh.jcartadministrationback.dto.in.CustomerSearchInDTO;
import com.yh.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import com.yh.jcartadministrationback.po.Customer;
import com.yh.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 20:53
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    //列表假分页
    @Override
    public Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Customer> page = customerMapper.search(
               customerSearchInDTO.getUsername(),
               customerSearchInDTO.getRealName(),
               customerSearchInDTO.getMobile(),
               customerSearchInDTO.getEmail(),
               customerSearchInDTO.getStatus()
        );
        return page;
    }

    //回显ID
    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
