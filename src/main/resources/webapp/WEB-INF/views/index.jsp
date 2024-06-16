<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Colour</title>
<body>
<h1>Add User</h1>
<form action="users" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br>
    <input type="submit" value="Add User">
</form>
<a href="users">View Users</a>
</body>
</html>


