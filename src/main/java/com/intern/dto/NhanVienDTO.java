package com.intern.dto;

import java.math.BigDecimal;
import java.util.Date;

public class NhanVienDTO {
    private String maNhanVien;
    private String ho;
    private String ten;
    private Date ngaySinh;
    private Date ngayLamViec;
    private String diaChi;
    private String dienThoai;
    private BigDecimal luongCoBan;
    private BigDecimal phuCap;

    public NhanVienDTO() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public BigDecimal getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(BigDecimal luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public BigDecimal getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(BigDecimal phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String toString() {
        return "NhanVienDTO{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", ngayLamViec=" + ngayLamViec +
                ", diaChi='" + diaChi + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", phuCap=" + phuCap +
                '}';
    }
}
