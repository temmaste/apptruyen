package com.example.apptruyen.api;

import com.example.apptruyen.model.Nguoidung;
import com.example.apptruyen.model.Truyen;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface serviceApi {
    Gson gson = new GsonBuilder().setDateFormat("yyyy/mm/dd HH:mm:ss").create();
   serviceApi api= new Retrofit.Builder()
           .baseUrl("http://172.16.243.40:8080/undungdoctruyen/rest/").addConverterFactory(GsonConverterFactory.create(gson)).build().create(serviceApi.class);

   @GET("nguoidung/dangnhap")
   Call<Boolean> dangnhapApi(@Query("username") String username,@Query("password") String password);
    @POST("nguoidung/dangki")
    Call<Boolean> dangkiApi(@Query("name") String name,@Query("username") String username,@Query("password") String password);
   @GET("truyen")
   Call<List<Truyen>> getTruyen();
}
