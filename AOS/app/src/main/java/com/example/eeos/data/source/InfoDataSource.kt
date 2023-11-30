package com.example.eeos.data.source

import com.example.eeos.data.model.remote.request.RequestPutActiveStatusDto
import com.example.eeos.data.model.remote.response.ResponseGetActiveStatusDto
import com.example.eeos.data.model.remote.response.ResponsePutActiveStatusDto
import com.example.eeos.data.model.remote.response.base.BaseResponse
import com.example.eeos.data.service.InfoService
import javax.inject.Inject

class InfoDataSource @Inject constructor(
    private val infoService: InfoService
) {
    suspend fun getActiveStatus(): BaseResponse<ResponseGetActiveStatusDto> =
        infoService.getActiveStatus()

    suspend fun putActiveStatus(
        requestPutActiveStatusDto: RequestPutActiveStatusDto
    ): BaseResponse<ResponsePutActiveStatusDto> = infoService.putActiveStatus(
        requestPutActiveStatusDto
    )
}