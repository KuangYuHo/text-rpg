<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    System.out.println("register.jsp 真的執行了");
%>

<html>
<h1>我現在在 register.jsp</h1>

<head><title>註冊</title></head>
<body>
    <h2>註冊帳號</h2>
    <form method="post" action="/doRegister">
        帳號:<input type="text" name="username" /><br/>
        密碼:<input type="password" name="password" /><br/>
        <input type="submit" value="註冊" />
    </form>

<c:if test="${not empty error}">
    <p style="color: red">${error}</p>
</c:if>
    <a href="/login">返回登入</a>

</body>
</html>