package com.example.eeos.data.service

import com.example.eeos.data.model.remote.request.RequestPutActiveStatusDto
import com.example.eeos.data.model.remote.response.ResponseGetActiveStatusDto
import com.example.eeos.data.model.remote.response.ResponsePutActiveStatusDto
import com.example.eeos.data.model.remote.response.base.BaseResponse
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT

interface InfoService {
    @GET("members/activeStatus")
    suspend fun getActiveStatus(): ApiResponse<BaseResponse<ResponseGetActiveStatusDto>>

    @PUT("members/activeStatus")
    suspend fun putActiveStatus(
        @Body requestPutActiveStatusDto: RequestPutActiveStatusDto
    ): ApiResponse<BaseResponse<ResponsePutActiveStatusDto>>

    @DELETE("auth/withdraw")
    suspend fun postDeleteUser(): ApiResponse<BaseResponse<Unit>>
}
