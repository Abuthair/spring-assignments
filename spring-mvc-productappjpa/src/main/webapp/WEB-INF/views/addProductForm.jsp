<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addProduct" method="get">
Enter name<input name="name"  type="text" placeholder="Enter name"><br>
Enter Category 
<select name="category">
<option value="ELECTRONICS">Electronics</option>
<option value="TOYS">Toys</option>
</select><br>
Enter brand<input name="brand" type="text" placeholder="Enter brand"><br>
Enter price<input name="price" type="text" placeholder="Enter price"><br>
<input value="Add Product"type="submit"> 
</form>
</body>
</html>