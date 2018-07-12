<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product To Card</title>
</head>
<body>

	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>

	<h3>Search Product</h3>
	<form method="POST"
		action="${pageContext.request.contextPath}/addProductToCard">
		<table>
			<td>Code</td>
			<td><input type="text" name="code" value="${product.code}" /></td>

			<td>Name</td>
			<td><input type="text" name="name" value="${product.name}" /></td>

			<tb> <input type="submit" value="Search" /></tb>
		</table>
	</form>
	<h3>Product List</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			chut
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Add To Card</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.code}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
				<td><a href="editProduct?code=${product.code}">Add</a></td>
			</tr>
		</c:forEach>
	</table>

	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>