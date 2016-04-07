<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
      <form action="${pageContext.request.contextPath}/servlet/Updateperosn" method="get">
     id:<input type="text" name="id" id="id"/><br>
     name:<input type="text" name="name" id="name"/><br>
     age:<input type="text" name="age" id="age"/><br>
     description:<input type="text" name="description" id="description" /><br>
   <input type="submit" value="提交修改"/>
  </form>
   <hr>
   <a href="http://localhost:8080/mysq_Dbutils_servlet/index.html">首页</a>
  </body>
</html>
