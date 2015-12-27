<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>NHN BASECAMP</title>
</head>
<body>
<h1>
   	GUEST BOOK
</h1>
<table border="1">
    <tr align="center">
        <td width="100px">EMAIL</td>
        <td width="100px">PASSWORD</td>
        <td width="100px">CONTEXT</td>
        <td width="100px">ANOTHER</td>
    </tr>
<c:forEach var="guest_books" items="${GB}">
    <tr align="center">
        <td>${guest_books.email}</td>
        <td>${guest_books.password}</td>
        <td>${guest_books.context}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>