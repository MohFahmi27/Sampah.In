package com.example.mysampahin.rest;

import com.example.mysampahin.models.PostMsgNotif;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST
    Call<PostMsgNotif> postMsg(@Header ("x-api-key")String api, @Field("msisdn") String noHp, @Field("content") String content);
}
