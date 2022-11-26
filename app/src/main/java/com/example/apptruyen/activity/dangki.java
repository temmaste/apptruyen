package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apptruyen.R;
import com.example.apptruyen.api.serviceApi;

import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class dangki extends AppCompatActivity {
    EditText name,username,password,passwordagain;
    TextView btndangki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
        addControl();
        addEvent();
    }

    private void addEvent() {
        btndangki.setOnClickListener(v->{
            checkAndSignup();
        });
    }

    private void checkAndSignup() {
        if(name.getText().toString().isEmpty()||username.getText().toString().isEmpty()
        ||password.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
            Toast.makeText(this, "Vui lòng nhập đầy đủ", Toast.LENGTH_SHORT).show();
        }else{

            if(isValidPassword(password.getText().toString())){
                if(password.getText().toString().equals(passwordagain.getText().toString())){
                    serviceApi.api.dangkiApi(name.getText().toString().trim()
                            ,username.getText().toString().trim(),password.getText().toString().trim()).enqueue(new Callback<Boolean>() {
                        @Override
                        public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                            Toast.makeText(dangki.this, "Tạo tài khoản thành công", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<Boolean> call, Throwable t) {
                            Toast.makeText(dangki.this, "Tạo tài khoản thất bại", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else{
                    Toast.makeText(this, "Vui lòng nhập đúng mật khẩu 2", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Mật khẩu không hợp lệ", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static boolean isValidPassword(String s) {
        Pattern PASSWORD_PATTERN
                = Pattern.compile(
                "[a-zA-Z0-9\\!\\@\\#\\$]{8,24}");

        return !TextUtils.isEmpty(s) && PASSWORD_PATTERN.matcher(s).matches();
    }
    private void addControl() {
        name = findViewById(R.id.ed_dangki_inputten);
        username = findViewById(R.id.ed_dangki_inputEmail);
        password = findViewById(R.id.ed_dangki_inputPassword);
        passwordagain = findViewById(R.id.ed_dangki_inputPasswordAgain);
        btndangki = findViewById(R.id.btn_dangki_btnLogin);
    }

}