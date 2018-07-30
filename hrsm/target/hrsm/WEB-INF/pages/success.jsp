<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2018/7/25
  Time: 19:50
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
<a href="getResume">创建简历</a>
<table cellspacing="1" cellpadding="1" border="0">
    <c:forEach var="i" begin="0" end="${fn:length(sessionScope.recr)-1}">
        <tr>
            <td>${sessionScope.recr[i].department}</td>
            <td>${sessionScope.recr[i].position}</td>
            <td>${sessionScope.recr[i].salary}</td>
            <td>${sessionScope.recr[i].num}</td>
            <td>
                <form action="mailing">
                    <input type="submit" value="投递" name="mail">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
