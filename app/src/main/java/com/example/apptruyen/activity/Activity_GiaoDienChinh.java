package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.adapter.adapter_truyen;
import com.example.apptruyen.api.serviceApi;
import com.example.apptruyen.clicklistenner.clickTruyen;
import com.example.apptruyen.model.Truyen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_GiaoDienChinh extends AppCompatActivity implements clickTruyen {

    RecyclerView rcv_truyenmoi,rcv_dexuat;
    LinearLayout ln_xephang,ln_phanloai;
    List<Truyen> dsTruyen = new ArrayList<>();
    LinearLayout btn_phanloai;
    private adapter_truyen adapterTruyen;
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
                if(response.body()!=null){
                    for(Truyen truyen: response.body()){
                        dsTruyen.add(0,truyen);
                    }
                    adapterTruyen.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Truyen>> call, Throwable t) {
                //xu ly loi
                Toast.makeText(Activity_GiaoDienChinh.this, "loi!!!!!", Toast.LENGTH_SHORT).show();
            }
        });

        adapterTruyen= new adapter_truyen(dsTruyen,this);
        rcv_truyenmoi.setAdapter(adapterTruyen);
        //rcv_dexuat.setAdapter(adapterTruyen);
        rcv_truyenmoi.setLayoutManager(

                new GridLayoutManager(this,2)

        );
        addEvent();
    }

    private void addEvent() {
        btn_phanloai.setOnClickListener(v->{
            Intent i =new Intent(Activity_GiaoDienChinh.this,Activity_PhanLoai.class);
            startActivity(i);
        });
    }

    private void addControls() {
        rcv_truyenmoi=findViewById(R.id.rcw_giaodienchinh_truyenmoicapnhat);
        rcv_dexuat=findViewById(R.id.rcw_giaodienchinh_dexuat);
        ln_xephang = findViewById(R.id.ln_giaodienchinh_xephang);
        ln_phanloai=findViewById(R.id.ln_giaodienchinh_phanloai);
        btn_phanloai=findViewById(R.id.ln_giaodienchinh_phanloai);
    }


    @Override
    public void onCickNext(int posision) {
        Truyen truyen =dsTruyen.get(posision);
        Intent i = new Intent(Activity_GiaoDienChinh.this,xem_tt_truyen.class);
        i.putExtra("truyen_ct",truyen);
        startActivity(i);
    }
}