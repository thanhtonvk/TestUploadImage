package com.example.testuploadimage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface APIService {
    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
    APIService api = new Retrofit.Builder().baseUrl("http://192.168.1.107:5000").
            addConverterFactory(GsonConverterFactory.create(gson)).
            build().
            create(APIService.class);
    @Multipart
    @POST("/")
    Call<Student> detectIDSV(@Part MultipartBody.Part image);
}
