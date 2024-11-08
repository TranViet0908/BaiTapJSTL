<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả Đăng Ký</title>
</head>
<body>
    <h2>Kết quả Đăng Ký</h2>
    <p>Tài khoản đăng nhập: ${requestScope.username}</p>
    <p>Email: ${requestScope.email}</p>
    <p>Số điện thoại: ${requestScope.phone}</p>

    <form action="RegisterServlet" method="get">
        <button type="submit" name="lang" value="en">English</button>
    </form>
</body>
</html>
