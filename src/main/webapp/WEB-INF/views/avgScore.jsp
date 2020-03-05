<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/22 0022
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="item">
        ${item.getS_id()}
        ${item.getS_name()}
        ${item.getYw_score()}
        ${item.getSx_score()}
        ${item.getYy_score()}
        ${item.getAvg()}<br>
    </c:forEach>
</body>
</html>
