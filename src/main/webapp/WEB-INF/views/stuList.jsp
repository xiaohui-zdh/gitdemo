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
    <c:forEach items="${list}" var="student">
        ${student.getS_id()}
        ${student.getS_name()}
        ${student.getS_birth() }
        ${student.getS_sex()}
        <a href="${pageContext.request.contextPath}/updateStudent?s_id=${student.getS_id()}">修改</a><br>
    </c:forEach>
</body>
</html>
