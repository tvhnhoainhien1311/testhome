<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Nhân Viên</h2>
	<form method="POST" action="addNhanVien" modelAttribute="nhanvien">>
    Id: <input path="id" />
		<br />
    Name: <input path="name" />
		<input type="submit" value="Submit" />
	</form>
</body>
</html>