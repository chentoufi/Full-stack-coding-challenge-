<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
<style>
#customer{
font-family: "Trebuchet MS",Arial,Helvetica,sans-serif;
border-collapse: collapse;
width:100%;
}
#customer td,#customer th{
border: 1px solid #ddd;
padding: 8px;
}
#customer tr:hover {
	background-color: #ddd;
}
#custmer th{
padding-top: 12px;
padding-bottom: 12px;
text-align: left;
background-color: #4CAF50;
color: white;
}
</style>
</head>
<body>
<form action="Costumer" method="post">
<label for="nameComponent">Search Component</label>
<input type="text" name="nameComponent" id="nameComponent"/>
<input type="submit" value="submit"/>
</form>
<p><c:out value="${message}"></c:out></p>
<table id="customer">
<tr>
<th>Component Name</th>
<th>Componenet Price</th>
</tr>
<tr>
<td><c:out value="${name}"></c:out></td>
<td><c:out value="${price}"></c:out></td>
</tr>
</table>
</body>
</html>