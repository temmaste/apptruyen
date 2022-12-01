package com.example.apptruyen.model;

import java.io.Serializable;

public class Tap implements Serializable {
    int maTap;
    String tenTap;
    String noiDung;

    public Tap(int maTap, String tenTap, String noiDung) {
        this.maTap = maTap;
        this.tenTap = tenTap;
        this.noiDung = noiDung;
    }
    public Tap() {

    }

    @Override
    public String toString() {
        return "Tap{" +
                "maTap=" + maTap +
                ", tenTap='" + tenTap + '\'' +
                ", noiDung='" + noiDung + '\'' +
                '}';
    }

    public int getMaTap() {
        return maTap;
    }

    public void setMaTap(int maTap) {
        this.maTap = maTap;
    }

    public String getTenTap() {
        return tenTap;
    }

    public void setTenTap(String tenTap) {
        this.tenTap = tenTap;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
