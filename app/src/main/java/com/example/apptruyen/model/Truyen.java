package com.example.apptruyen.model;

import java.util.Date;

public class Truyen {
    private Integer matruyen;

    private Tacgia tacgia;
    private String tentruyen;
    private String mota;
    private Date ngaydang;
    private String hinh;

    public Truyen(Integer matruyen, Tacgia tacgia, String tentruyen, String mota, Date ngaydang, String hinh) {
        this.matruyen = matruyen;
        this.tacgia = tacgia;
        this.tentruyen = tentruyen;
        this.mota = mota;
        this.ngaydang = ngaydang;
        this.hinh = hinh;
    }
    public Truyen() {

    }

    public Integer getMatruyen() {
        return matruyen;
    }

    public void setMatruyen(Integer matruyen) {
        this.matruyen = matruyen;
    }

    public Tacgia getTacgia() {
        return tacgia;
    }

    public void setTacgia(Tacgia tacgia) {
        this.tacgia = tacgia;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Date getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(Date ngaydang) {
        this.ngaydang = ngaydang;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}
