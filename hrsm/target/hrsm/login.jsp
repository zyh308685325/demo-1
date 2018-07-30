
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<body>

<form action="login">
    用户名：<input type="text" name="name">
    密码：<input type="text" name="pass">
    <input type="submit" value="登录" name="loginUser">
    <input type="submit" value="注册" name="register">
</form>
${Mailerror}
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
