<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update Product</h2>
<form action="updateProduct" method="get">
<input type="hidden" name="productId" value="${product.productId }"><br> 
        Enter Product Name <input type="text" name="name" value="${product.name }"><br>
        Enter Category
        <select name="category">
        <option value="${product.category}">${product.category}</option>
        <option value="ELECTRONICS">ELECTRONICS</option>
        <option value="TOYS">TOYS</option>
   
        </select>
        Enter Brand <input type="text" name="brand" value="${product.brand }"><br> 
        Enter Price <input type="text" name="price" value="${product.price }"><br> 
        <input    type="submit" value="update product">
    </form>
</body>
</html>