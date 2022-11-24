package com.example.apptruyen.model;

public class Nguoidung {
    private Integer manguoidung;
    private String tennguoidung;
    private String hinhdaidien;
    private String matkhau;

    public Integer getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(Integer manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getHinhdaidien() {
        return hinhdaidien;
    }

    public void setHinhdaidien(String hinhdaidien) {
        this.hinhdaidien = hinhdaidien;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    private String tentaikhoan;

    public Nguoidung() {
    }

    public Nguoidung(Integer manguoidung, String tennguoidung, String hinhdaidien, String matkhau, String tentaikhoan) {
        this.manguoidung = manguoidung;
        this.tennguoidung = tennguoidung;
        this.hinhdaidien = hinhdaidien;
        this.matkhau = matkhau;
        this.tentaikhoan = tentaikhoan;
    }
}
