<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>登入</title></head>
<body>
<h2>使用者登入</h2>
<form method="post" action="/login">
    帳號：<input type="text" name="username" /><br />
    密碼：<input type="password" name="password" /><br />
    <input type="submit" value="登入" />
</form>
<a href="/register">註冊新帳號</a>
</body>
</html>