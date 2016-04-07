<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="/js/jquery-1.8.2.js"></script>

  </head>
  
  <body>
   <form action="${pageContext.request.contextPath}/servlet/Showallperson" method="post">
   <input type="text" value="ALL" readonly="readonly"/>
   <input type="submit" value="查询"/>
   </form>
   <hr>
   <a href="http://localhost:8080/mysq_Dbutils_servlet/index.html">首页</a>
  </body>
</html>
