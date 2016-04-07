<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
   <form action="${pageContext.request.contextPath}/servlet/Findbyidperson" method="post">
   <input type="text" name="idperson"/>
   <input type="submit" value="查询"/>
   </form>
   <hr>
   <a href="http://localhost:8080/mysq_Dbutils_servlet/index.html">首页</a>
  </body>
</html>
