<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="../js/jquery-1.8.2.js"></script> 
  </head>
  <body>
  	<table id="tableID" border="1" align="center" width="60%">
  		<thead>
	  		<tr>	
	  			<th>name</th>
	  			<th>age</th>
	  			<th>description</th>
	  			<th>操作</th>
	  			
	  		</tr>
  		</thead>
  		<tbody id="tbodyID">
  			
  		</tbody>
  	</table>
  	<input type="button" id="eng" value="提交到数据库" />
  	
  	<hr>
  	name：<input type="text" id="nameID"/>
  	age：  <input type="text" id="ageID"/>
  	description：  <input type="text" id="descriptionID"/>
  			<input type="button" value="增加" id="addID"/>
  			
  	<hr>
   <a href="http://localhost:8080/mysq_Dbutils_servlet/index.html">首页</a>
  			
  </body>
  
  <script type="text/javascript">
  		//定位"增加"按钮，同时添加单击事件
  		$("#addID").click(function(){
  			//获取用户名和密码的值
  			var name = $("#nameID").val();
  			var age = $("#ageID").val();
  			var description = $("#descriptionID").val();
  			//去掉二边的空格
  			name = $.trim(name);
  			age = $.trim(age);
  			description = $.trim(description);
  			if(name.length == 0 || age.length == 0){
				//提示用户  				
  				alert("name或age没有填");
  			}else{
  				//创建1个tr标签
  				var $tr = $("<tr></tr>");
  				//创建3个td标签
  				var $td1 = $("<td>"+name+"</td>");
  				var $td2 = $("<td>"+age+"</td>");
  				var $td3 = $("<td>"+description+"</td>");
  				var $td4 = $("<td></td>");
  				//创建input标签，设置为删除按钮
  				var $del = $("<input type='button' value='删除'>");
  				//为删除按钮动态添加单击事件
  				$del.click(function(){
  					//删除按钮所有的行，即$tr对象
  					$tr.remove();
  				});
  				//将删除按钮添加到td3标签中
  				$td4.append($del);
  				//将3个td标签依次添加到tr标签中
  				$tr.append($td1);
  				$tr.append($td2);
  				$tr.append($td3);
  				$tr.append($td4);
  				//将tr标签添加到tbody标签中
  				$("#tbodyID").append($tr);
  				//清空用户名和密码文本框中的内容
  				$("#nameID").val("");
  				$("#ageID").val("");
  				$("#descriptionID").val("");
  			}
  		});
  </script>
  <script type="text/javascript">
  
  
  </script>
  
  
</html>



