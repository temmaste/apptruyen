package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.api.serviceApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Dangnhap extends AppCompatActivity {
    TextView username,password,btn,btndangki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        username = findViewById(R.id.ed_dangnhap_inputEmail);
        password = findViewById(R.id.ed_dangnhap_inputPassword);
        btndangki= findViewById(R.id.tv_dangnhap_dangki);
        btn = findViewById(R.id.btn_dangnhap_btnLogin);
        addControl();
    }

    private void addControl() {
        btn.setOnClickListener(v->{
            serviceApi.api.dangnhapApi(username.getText().toString(),password.getText().toString()).enqueue(new Callback<Boolean>() {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                    Boolean result = response.body();
                    if(result==true){
                        Toast.makeText(Activity_Dangnhap.this,"thanh cong",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Activity_Dangnhap.this,"that bai",Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Boolean> call, Throwable t) {
                    Toast.makeText(Activity_Dangnhap.this,"that bai1",Toast.LENGTH_SHORT).show();
                }
            });
        });
        btndangki.setOnClickListener(v->{
            Intent intent= new Intent(this,dangki.class);
            startActivity(intent);
        });
    }
}