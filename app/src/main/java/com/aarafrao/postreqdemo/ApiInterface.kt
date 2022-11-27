package com.aarafrao.postreqdemo

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("api/login")
    fun sendReq(@Body requestModel: RequestModel) : Call<ResponseModel>
}