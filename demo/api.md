## 杨浩
## image

URL: /image/pic  
Method：POST  
Request Content-Type: multipart/formdata  
RequestParam: image  

ResponseBody:  
```
http://lll.com/lll.png

```

Request Field  

| 字段|类型|描述| 
| image|String|上传图片|

Response Field  

| 字段|类型|描述| 
|  url| String|上传图片地址|


## administrator
URL: /administrator/user?username={username}&password={password}  
Method：GET  

ResponseBody:  
```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

```

Request Field  

| 字段|类型|描述| 
| username|String|账号|
| password|String|密码|

Response Field  

| 字段|类型|描述| 
|  |String| jwt token|


## Profile
URL: /administrator/getProfile  
Method：GET  

RequestHeader:  
jcartToken: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

ResponseBody:  
```json
{
    "administratorId": 1,
    "username": "username",
    "realName": "yanghao",
    "email": "yanghao@qq.com",
    "avatarUrl": "***.jpg",
    "status": 0,
    "createTimestamp": 12345678911
}
```

Request Header  

| 字段|类型|描述| 
| jcartToken|String|jwt token|


Response Field  

| 字段|类型|描述| 
|  administratorId|Integer| Id|
|  username|String|用户名|
|  realName|String|姓名|
|  email|String| Eamil|
|  avatarUrl|String|头像|
|  status|Byte|状态|
|  createTimestamp|Long|时间戳|

## Profile
URL: /administrator/updateProfile  
Method：POST  

RequestHeader:  
jcartToken: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

RequestBody:  
```json
{
    "password": "1",
    "realName": "yanghao",
    "email": "yanghao@qq.com",
    "avatarUrl": "***.jpg",
    "status": 1
}
```

Request Header  

| 字段|类型|描述| 
| jcartToken|String|jwt token|
Request Field  

| 字段|类型 |描述| 
| password| String| 密码|
| realName| String| 姓名|
| email| String| Email|
| avatarUrl| String| 头像|
| status| Byte| 状态|