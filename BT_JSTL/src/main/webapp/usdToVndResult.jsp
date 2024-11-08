<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả chuyển đổi</title>
</head>
<body>
    <h2>Kết quả chuyển đổi</h2>
    <p>Số tiền USD: <%= request.getAttribute("usd") %> USD</p>
    <p>Số tiền VNĐ: <%= request.getAttribute("vnd") %> VNĐ</p>
</body>
</html>
