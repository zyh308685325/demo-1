<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2018/7/30
  Time: 16:44
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
    <table border="1" cellpadding="1" cellspacing="1">
        <tr>
            <td>姓名</td>
            <td><input type="text"></td>
            <td>性别</td>
            <td><input type="text"></td>
            <td>年龄</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>学历</td>
            <td colspan="2"><input type="text"></td>
            <td>专业</td>
            <td colspan="2"><input type="text"></td>
        </tr>
        <tr>
            <td>联系电话</td>
            <td colspan="2"> <input type="text"></td>
            <td>出生日期</td>
            <td colspan="2"><input type="text"></td>
        </tr>
        <tr>
            <td>毕业时间</td>
            <td colspan="2"><input type="text"></td>
            <td>民族</td>
            <td><input type="text"></td>
            <td>籍贯</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td colspan="2">住址</td>
            <td colspan="2"><input type="text"></td>
        </tr>
    </table>
</body>
</html>
