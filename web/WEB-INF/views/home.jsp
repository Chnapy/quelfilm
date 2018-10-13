<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 13/10/2018
  Time: 01:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>

Time: ${serverTime}

<form action="/user" method="post">

    <label for="userName">username: </label>

    <input type="text" name="userName" id="userName" />

    <input type="submit" />

</form>

</body>
</html>
