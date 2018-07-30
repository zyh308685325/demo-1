<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2018/7/27
  Time: 12:08
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
    <script type="text/javascript">
        function myCheck() {
            //alert("haha")
            var flag=true;
            var flag1=true;
            if(document.getElementById("username").value==""){
                flag=false;
            }
            if(document.getElementById("password").value==""){
                flag1=false;
            }
            //alert("haha:"+flag+"xixi:"+flag1)
            if(flag==true&&flag1==true){
                document.getElementById("submitButton").disabled=false;
            }else{
                document.getElementById("submitButton").disabled=true;
            }
        }
        function myCheck1() {
            var xmlHttp=new XMLHttpRequest();
            xmlHttp.open("get","checkNameName?name="+document.getElementById("username").value,true)
            xmlHttp.send();

            xmlHttp.onreadystatechange=function () {
                if(xmlHttp.readyState==4&&xmlHttp.status==200){
                    document.getElementById("sp1").innerHTML=xmlHttp.responseText;
                }
            }
        }
        function mycheck2() {
            var xmlHttp=new XMLHttpRequest();
            xmlHttp.open("get","checkPassPass?name="+document.getElementById("password").value,true)
            xmlHttp.send();

            xmlHttp.onreadystatechange=function () {
                if(xmlHttp.readyState==4&&xmlHttp.status==200){
                    document.getElementById("sp2").innerHTML=xmlHttp.responseText;
                }
            }
        }


    </script>

</head>
<body>
   <form action="register" onchange="myCheck()">
       用户名<input type="text"  id="username" name="name">
       密码 <input type="password" id="password" name="pass">
       <input type="submit" value="确定" name="ok">
       ${error}
   </form>
</body>
</html>
