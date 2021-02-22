# 云E办在线办公管理项目
## 采用前后端分离技术，前端框架使用vue，后端使用SpringBoot
版本依赖：
- SpringBoot 2.4.2 MySQL8 
- mybatis-plus 3.4.0 mybatis-plus-generator 3.4.0
- Swagger2  3.0.0 
- JWT 0.9.1(还有JDK11移除的3个依赖) SpringSecurity 2.4.2 
- kaptcha 0.0.9
***
### 2021/2/14
- 使用代码生成器快速生成 Pojo、Mapper、Mapper XML、Service、Controller 等各个模块的代码，极大的提升了开发效率。 

### 2021/2/15
JWT令牌格式： jwt.Head token(头部加一个空格加上token)
- 根据JWT生成Token工具类，生成公共返回对象包括调用成功返回的以及调用失败返回的。
***
### 2021/2/16
**踩坑：JDK11和JDK8引用jjwt依赖的不同点**
我选择的处理方法是添加JDK11删除的依赖包 
报错处理情况[解决方法](https://blog.csdn.net/u010748421/article/details/107363925/) 
- 编写LoginController 编写登录请求并返回Token
- 编写SecurityConfig 添加登录授权过滤器 编写自定义返回结果(未登录以及登录之后无权限)
- 配置Swagger2接口文档基本配置以及使用漂亮的ui Swagger2界面。
- 处理在Swagger2中携带Token的方法，赋予Authorization 
***
### 2021/2/17
- 编写验证码配置，生成图形验证码，配置 produces = "image/jpeg" 接口文档不再是乱码
- try with resources 自动关闭资源。将要关闭的资源放在try语句内，在try语句执行完后自动关闭资源。
- 实现根据用户id查询菜单列表
- ~~Redis集成菜单功能~~
- 根据请求url判断角色(就是每个菜单需要哪些角色权限)
- 判断用户角色。接受请求后，遍历当前url所需的所有角色，与当前登录的角色比较。若相同则拥有查看该菜单的权限，若都不相同则抛出权限不足的异常。
### 2021/2/19
- 实现职位管理功能(包括单表的增删改查，Mybatis-Plus非常方便)
- 添加简单全局异常处理
- 实现职称管理功能(同职位管理)
- 实现权限组角色功能
- 实现权限组菜单查询，更新功能
### 2021/2/20
- 复习存储过程
```sql
/* 创建存储过程 
create procedure p_name(IN,OUT,INOUT)
BEGIN 
END
在存储过程中使用用户变量 
变量名必须@开头，并且不要乱用  */
set @str = 'hello';
create procedure HelloWorld()
select CONCAT(@str,'world');
-- 调用存储过程
call HelloWorld();
-- 在存储过程中传递全局范围用户变量 
create procedure p1() set @last_procedure = 'p1';
create procedure p2() select CONCAT('last_procedure was ',@last_procedure);
call p1();
call p2();
```
### 2021/2/22
- 查询所有部门
- 添加部门
- 删除部门



