package com.example.apptruyen.model;

public class Tacgia {
    private int matacgia;
    private String tentacgia;

    public Tacgia(int matacgia, String tentacgia) {
        this.matacgia = matacgia;
        this.tentacgia = tentacgia;
    }
    public Tacgia() {

    }

    public int getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(int matacgia) {
        this.matacgia = matacgia;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }
}
