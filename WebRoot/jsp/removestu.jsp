<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="/js/jquery-1.8.2.js"></script>

  </head>
  
  <body>
  <form action="${pageContext.request.contextPath}/servlet/RemovePerson">
   <input type="text" name="id" id="cba" />
   <input type="submit" value="提交删除"/>
  </form>
   
  <hr>
   <a href="http://localhost:8080/mysq_Dbutils_servlet/index.html">首页</a>
  
  </body>
</html>
