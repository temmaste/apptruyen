package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.adapter.adapter_phanloai;
import com.example.apptruyen.adapter.adapter_truyen;
import com.example.apptruyen.api.serviceApi;
import com.example.apptruyen.model.Theloai;
import com.example.apptruyen.model.Truyen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_PhanLoai extends AppCompatActivity {

    RecyclerView rcv_theloai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phan_loai);
        addControl();
        hienTheLoai();
        addEvent();
    }


    private void hienTheLoai() {
        serviceApi.api.getTheLoai().enqueue(new Callback<List<Theloai>>() {
            @Override
            public void onResponse(Call<List<Theloai>> call, Response<List<Theloai>> response) {
                if(response.body()!=null){
                    List<Theloai> dstl=response.body();
                    adapter_phanloai adapterPhanloai= new adapter_phanloai(dstl);
                    rcv_theloai.setAdapter(adapterPhanloai);
                    rcv_theloai.setLayoutManager(new GridLayoutManager(Activity_PhanLoai.this, 2));
                }
            }

            @Override
            public void onFailure(Call<List<Theloai>> call, Throwable t) {
                Toast.makeText(Activity_PhanLoai.this, "loi !!!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addEvent() {

    }

    private void addControl() {
        rcv_theloai=findViewById(R.id.rcv_phanloai_theloai);
    }
}