<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Colour</title>
</head>
<<body>
<h1>Users</h1>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Username</th>
    <th>Email</th>
    <th>Created At</th>
    <th>Updated At</th>
  </tr>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.userId}</td>
      <td>${user.username}</td>
      <td>${user.email}</td>
<%--      <td>${user.createdAt}</td>--%>
<%--      <td>${user.updatedAt}</td>--%>
    </tr>
  </c:forEach>
</table>
<a href="../index.jsp">Add Another User</a>
</body>
</html>