# Java Web 网络商城——沃德商店

## 概览
本项目参考《Java Web 程序设计教程》，素材绝大部分来自该书资源。

导入的jar包如下；
- c3p0-0.9.5.5.jar
- c3p0-oracle-thin-extras-0.9.5.5.jar
- commons-beantils-1.9.1.jar
- commons-collections-3.2.2.jar
- commons-dbutils-1.7.jar
- commons-logging-1.2.jar
- jstl-1.2.jar
- mail.jar
- mchange-commons-java-0.2.9.jar
- mysql-connector-java-8.0.30.jar

## 1. 过滤器设计
具体代码查看：cn.mysotre.web.filter.EncodingFilter.java

Filter有四种拦截方式：REQUEST, INCLUDE, FORWARD, ERROR;

使用Filter处理编码的思路：
- response直接使用setContentType()方法;
- 创建MyRequest类处理请求，重写getParameterMap(), getParameterValue(), getParameterValues()方法;
- 若请求使用get方法，确保重新编码只进行一次;
- 若请求使用post方法，直接调用setCharacterEncoding();

## 2. 首页
具体代码查看：
- /web/client/: head.jsp, foot.jsp, menu_search.jsp, index.jsp。
- /web/client/js/: autoplay.js, form.js

jsp运行原理：访问jsp文件->生成java源文件->生成字节码文件->调用Servlet->销毁。

生成的Servlet实例常驻内存，多个客户端请求则创建多个线程，提高并发量并缩短响应时间。

jsp参考：https://www.runoob.com/jsp/jsp-tutorial.html

为了了防止重复编写代码，将网页的顶部、底部以及搜索菜单单独抽取成head.jsp, foot.jsp, index.jsp。

## 3. 账号管理模块
### 3.1. 用户注册
### 3.2. 用户登录


## 4. 购物车模块

## 5. 查询模块

## 6. 商品管理模块

## 7. 订单管理模块

