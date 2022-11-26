package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.apptruyen.R;
import com.example.apptruyen.api.serviceApi;
import com.example.apptruyen.model.Truyen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Activity_GiaoDienChinh extends AppCompatActivity {

    RecyclerView rcv_truyenmoi,rcv_dexuat;
    LinearLayout ln_xephang,ln_phanloai,;
    List<Truyen> dsTruyen = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_chinh);

        addControls();

        try {
            dsTruyen = serviceApi.api.getTruyen().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addControls() {
        rcv_truyenmoi=findViewById(R.id.rcw_giaodienchinh_truyenmoicapnhat);
        rcv_dexuat=findViewById(R.id.rcw_giaodienchinh_dexuat);
        ln_xephang = findViewById(R.id.ln_giaodienchinh_xephang);
        ln_phanloai=findViewById(R.id.ln_giaodienchinh_phanloai);

    }
}