package com.example.apptruyen.model;

import java.io.Serializable;

public class Theloai  implements Serializable{
    private int matheloai;

    public Theloai() {
    }

    private String tentheloai;

    public Theloai(int matheloai, String tentheloai) {
        this.matheloai = matheloai;
        this.tentheloai = tentheloai;
    }

    public int getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }
}
