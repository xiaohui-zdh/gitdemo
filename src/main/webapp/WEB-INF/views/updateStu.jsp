<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/22 0022
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/saveStudent" method="post">
        <input type="text" name="s_id" value="${stu.getS_id()}">
        <input type="text" name="s_name" value="${stu.getS_name()}">
        <input type="text" name="s_birth" value="${stu.getS_birth()}">
        <input type="text" name="s_sex" value="${stu.getS_sex()}">
        <input type="submit" value="提交">
    </form>
</body>
</html>
