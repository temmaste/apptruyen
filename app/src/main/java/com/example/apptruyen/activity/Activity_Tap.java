package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.api.serviceApi;
import com.example.apptruyen.model.Tap;
import com.example.apptruyen.model.Theloai;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Tap extends AppCompatActivity {

    TextView tv_nd;
    List<Tap> dstap=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        tv_nd=findViewById(R.id.tv_tap_noidung);
        hienThi();
        addEvent();
    }

    private void addEvent() {

    }

    private void hienThi() {
        serviceApi.api.getTap().enqueue(new Callback<List<Tap>>() {
            @Override
            public void onResponse(Call<List<Tap>> call, Response<List<Tap>> response) {
                if(response.body()!=null){
                    for(Tap tap: response.body()){
                        dstap.add(0,tap);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Tap>> call, Throwable t) {
                Toast.makeText(Activity_Tap.this, "loi!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}