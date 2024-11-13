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
    <div class="dress-list row m-0 pt-3">
        <h2 class="mb-3 col-12 text-center">Danh sách phòng trọ</h2>
        <div class="col-10">

        </div>
        <div class="col-2">
            <a class="btn btn-sm btn-primary" href="/addPhongTro">Thêm Mới</a>
        </div>
    </div>
    <table class="table w-75 m-auto table-hover shadow-sm border rounded-lg mt-3">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">Mã phòng</th>
            <th scope="col">Tên người thuê</th>
            <th scope="col">Số điện thoại</th>
            <th scope="col">Ngày bắt đầu thuê</th>
            <th scope="col">Hình thức thanh toán</th>
            <th scope="col">Ghi chú</th>
            <th scope="col">Xóa</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="phongtro" items="${phongTroList}" varStatus="status">
            <tr>
                <th scope="row">${status.index + 1}</th>
                <td>PT-${phongtro.id}</td>
                <td>${phongtro.tenNguoiThue}</td>
                <td>${phongtro.soDienThoai}</td>
                <td>${phongtro.ngayBatDau}</td>
                <td>${phongtro.hinhThucThanhToan.hinhThucThanhToan}</td>
                <td>${phongtro.ghiChu}</td>
                <td>
                    <div class="mb-3 form-check">
                        <input type="checkbox" name="deletePt[]" id="${phongtro.id}" class="form-check-input" id="phongtro${phongtro.id}">
                    </div>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <th scope="row"></th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
                <button type="button" id="modalbtn" class="btn btn-sm btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Xóa
                </button>
                <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                ...
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <a href="" id="deletebutton" type="button" class="btn btn-primary">Save changes</a>
                            </div>
                        </div>
                    </div>
                </div>
            </td>
        </tr>
       
        </tbody>
    </table>

</main>
<footer>

</footer>
</body>
</html>
<script>
    function getCheckedIds() {
        var checkedCheckboxes = document.querySelectorAll('input[name="deletePt[]"]:checked');
        var checkedIds = [];
        checkedCheckboxes.forEach(function(checkbox) {
            checkedIds.push(checkbox.id);
        });

        var idString = checkedIds.join(',');
        return idString;
    }


    $('#modalbtn').on('click',function (){
        var idString = getCheckedIds();
        var a = $('#deletebutton');
        var href = "/delete?list="+idString;
        console.log(href);
        a.href = href;
    })
</script>