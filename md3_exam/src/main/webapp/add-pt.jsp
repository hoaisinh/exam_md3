<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
    <script src="https://code.jquery.com/jquery-3.7.1.slim.js" integrity="sha256-UgvvN8vBkgO0luPSUl2s8TIlOSYRoGFAX4jlCIm9Adc=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <title>Quan Lý Phòng Trọ</title>
</head>
<body>
<header>

</header>
<main>
    <h1 class="text-center mt-3 mb-3 ">Thêm mới phòng trọ</h1>
    <form method="post" action="/addPhongTro" class="w-25 m-auto pt-3 bg-light shadow p-2">
        <div class="form-group col-12">
            <label for="tenNguoiThue">Tên Người Thuê</label>
            <input class="form-control form-control-sm" type="text" name="tenNguoiThue" value="" id="tenNguoiThue"
                   pattern="^[a-zA-Z\s]{5,50}$"
                   title="Tên người thuê chỉ có thể chứa chữ cái và khoảng trắng, độ dài từ 5 đến 50 ký tự."
            >
        </div>
        <div class="form-group col-12">
            <label for="soDienThoai">Số điện thoại</label>
            <input class="form-control form-control-sm" type="text" name="soDienThoai" value="" id="soDienThoai"
                   pattern="^\d{10}$"
                   title="Số điện thoại phải là 10 ký tự số."
            >
        </div>
        <div class="form-group col-12">
            <label for="ngayBatDau">Ngày bắt đầu</label>
            <input class="form-control form-control-sm" type="date" name="ngayBatDau" value="" id="ngayBatDau">
        </div>
        <div class="form-group col-12">
            <label for="role">Hình Thức Thanh Toán</label>
            <select name="hinhThucThanhToan" id="role" class="form-control form-control-sm" required>
                <c:forEach var="pt" items="${hinhThucThanhToanList}">
                    <option value="${pt.id}">${pt.hinhThucThanhToan}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group col-12">
            <label for="ghiChu">Ghi chú</label>
            <textarea  name="ghiChu" id="ghiChu" class="form-control form-control-sm"  maxlength="200"></textarea>
        </div>
        <a class="btn btn-success btn-sm me-3 mr-3" href="index">Quay Lai</a>
        <button type="submit" value="Thêm" class="btn btn-sm btn-primary">Thêm</button>
    </form>
</main>
<footer>

</footer>
</body>
</html>