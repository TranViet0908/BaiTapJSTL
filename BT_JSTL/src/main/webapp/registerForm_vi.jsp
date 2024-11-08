<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng Ký</title>
</head>
<body>
    <h2>Đăng Ký</h2>
    <form action="RegisterServlet" method="post">
        <label for="username">Tài khoản đăng nhập:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="phone">Số điện thoại:</label>
        <input type="text" id="phone" name="phone" required><br>
        <input type="hidden" name="lang" value="vi">
        <button type="submit">Đăng ký</button>
    </form>

    <form action="RegisterServlet" method="get">
        <button type="submit" name="lang" value="en">English</button>
    </form>
</body>
</html>
