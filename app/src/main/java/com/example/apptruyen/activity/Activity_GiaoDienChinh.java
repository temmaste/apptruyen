package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.adapter.adapter_truyen;
import com.example.apptruyen.api.serviceApi;
import com.example.apptruyen.model.Truyen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_GiaoDienChinh extends AppCompatActivity {

    RecyclerView rcv_truyenmoi,rcv_dexuat;
    LinearLayout ln_xephang,ln_phanloai;
    List<Truyen> dsTruyen = new ArrayList<>();
    private adapter_truyen adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_chinh);

        addControls();

        //lay ds truyen trong api
        serviceApi.api.getTruyen().enqueue(new Callback<List<Truyen>>() {
            @Override
            public void onResponse(Call<List<Truyen>> call, Response<List<Truyen>> response) {
                //xu ly du lieu tra ve
                dsTruyen=response.body();
            }

            @Override
            public void onFailure(Call<List<Truyen>> call, Throwable t) {
                //xu ly loi
                Toast.makeText(Activity_GiaoDienChinh.this, "loi!!!!!", Toast.LENGTH_SHORT).show();
            }
        });

        adapter= new adapter_truyen(dsTruyen);
        rcv_truyenmoi.setAdapter(adapter);
    }

    private void addControls() {
        rcv_truyenmoi=findViewById(R.id.rcw_giaodienchinh_truyenmoicapnhat);
        rcv_dexuat=findViewById(R.id.rcw_giaodienchinh_dexuat);
        ln_xephang = findViewById(R.id.ln_giaodienchinh_xephang);
        ln_phanloai=findViewById(R.id.ln_giaodienchinh_phanloai);

    }
}