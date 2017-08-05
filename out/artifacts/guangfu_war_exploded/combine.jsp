<%--
  Created by IntelliJ IDEA.
  User: 滩涂上的芦苇
  Date: 2017/5/9
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>PV COUNSELOR</title>
    <meta charset="utf-8">
    <meta content="RESTful Web API Testing" name="description">
    <meta content="REST, API, Testing" name="keywords">
    <meta content="Christopher Reichert" name="author">
    <meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">
    <meta content="ie=edge" http-equiv="x-ua-compatible">
    <link rel="icon" href="/image/icon.png" type="image/x-icon">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="js/echarts.min.js"></script>
    <script src="js/china.js"></script>
    <script id="boot" type="application/json">
        {"component":"site/Home.js","token":null,"props":{"isLoggedIn":false},"account":null,"msg":null,"id":null,"ultDest":null}
    </script>
    <link href="css/commons.css" type="text/css" rel="stylesheet">
    <link href="css/site.css" type="text/css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,300,700,300italic,400italic" type="text/css" rel="stylesheet">


</head>
<body>
<jsp:include page="static/head.jsp"/>

<body>
<div style="width: 100%;height: auto">
    <form class="form-inline">
        <div class="form-group" >
            <label>装机容量(万W)</label>
            <input type="text" class="form-control" placeholder="10">
        </div>
        <%--<div class="form-group">--%>
        <%--<label>光伏板型号</label>--%>
        <%--<select class="form-control">--%>
        <%--<option>典型单晶硅组件</option>--%>
        <%--<option>典型多晶硅组件</option>--%>
        <%--<option>自定义光伏组件</option>--%>
        <%--</select>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
        <%--<label>追踪方式</label>--%>
        <%--<select class="form-control">--%>
        <%--<option>固定式安装</option>--%>
        <%--<option>斜单轴追踪</option>--%>
        <%--<option>双轴追踪</option>--%>
        <%--</select>--%>
        <%--</div>--%>
        <a href="/m_f.jsp" >
            <button type="button" class="btn btn-default">单晶硅固定式</button>
        </a>
        <a href="/m_o.jsp" >
            <button type="button" class="btn btn-default">单晶硅斜单轴</button>
        </a>
        <a href="/m_d.jsp" >
            <button type="button" class="btn btn-default">单晶硅双轴</button>
        </a>
        <a href="/s_f.jsp" >
            <button type="button" class="btn btn-default">多晶硅固定式</button>
        </a>
        <a href="/s_o.jsp" >
            <button type="button" class="btn btn-default">多晶硅斜单轴</button>
        </a>
        <a href="/s_d.jsp" >
            <button type="button" class="btn btn-default">多晶硅双轴</button>
        </a>

    </form>
</div>
<script src="js/m_d.js"></script>
<script src="js/data.js"></script>
<script src="js/show.js"></script>
</body>
</html>
