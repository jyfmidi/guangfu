<%--
  Created by IntelliJ IDEA.
  User: jyfmidi
  Date: 2017/8/1
  Time: 上午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
    <title>hive查询语句</title>
</head>
<body>
<%
    String mood = (String)request.getAttribute("mood");
%>
<form action="parseDataServlet" method="post">
    <lable>查询语句:</lable>
    <p>
        <input type="text" name="name" value="<%=mood%>">
    <p>
        <input type="submit" name="query" value="提交">
    </p>
</form>
</body>
</html>