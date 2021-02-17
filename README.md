# 云E办在线办公管理项目
## 采用前后端分离技术，前端框架使用vue，后端使用SpringBoot
版本依赖：
- SpringBoot 2.4.2 MySQL8 
- mybatis-plus 3.4.0 mybatis-plus-generator 3.4.0
- Swagger2  3.0.0 
- JWT 0.9.1(还有JDK11移除的3个依赖) SpringSecurity 2.4.2 
***
### 2021/2/14
- 使用代码生成器快速生成 Pojo、Mapper、Mapper XML、Service、Controller 等各个模块的代码，极大的提升了开发效率。 

### 2021/2/15
- 根据JWT生成Token工具类，生成公共返回对象包括调用成功返回的以及调用失败返回的。
***
### 2021/2/16
- 编写LoginController 编写登录请求并返回Token
- 编写SecurityConfig 添加登录授权过滤器 编写自定义返回结果(未登录以及登录之后无权限)
- 配置Swagger2接口文档基本配置以及使用漂亮的ui Swagger2界面。
- 处理在Swagger2中携带Token的方法，赋予Authorization 
**踩坑：JDK11和JDK8引用jjwt依赖的不同点**
  我选择的处理方法是添加JDK11删除的依赖包
  报错处理情况[解决方法](https://blog.csdn.net/u010748421/article/details/107363925/)






