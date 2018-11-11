<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2018/8/3
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
    <table>
        <c:forEach items="${recruits}" var="recruit">
            <tr>
                <td>${recruit.recruitInformation}</td>
                <td>${recruit.resume}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
