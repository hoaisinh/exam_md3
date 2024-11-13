create database phong_tro;
use phong_tro;
CREATE TABLE HinhThucThanhToan (
    MaHinhThuc INT AUTO_INCREMENT PRIMARY KEY,  
    TenHinhThuc VARCHAR(50) NOT NULL            
);
CREATE TABLE PhongTro (
    MaPhong INT AUTO_INCREMENT PRIMARY KEY,    
    TenNguoiThue VARCHAR(100) NOT NULL,         
    SoDienThoai VARCHAR(15),                   
    NgayBatDau DATE NOT NULL,                  
    MaHinhThucThanhToan INT,                    
    GhiChu TEXT,                               
    FOREIGN KEY (MaHinhThucThanhToan) REFERENCES HinhThucThanhToan(MaHinhThuc)  
);
INSERT INTO HinhThucThanhToan (TenHinhThuc) VALUES ('Theo tháng');
INSERT INTO HinhThucThanhToan (TenHinhThuc) VALUES ('Theo quý');
INSERT INTO HinhThucThanhToan (TenHinhThuc) VALUES ('Theo năm');