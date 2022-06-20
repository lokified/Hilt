package com.loki.hilt.data.remote.repository

import android.app.Application
import com.loki.hilt.R
import com.loki.hilt.data.domain.repository.MyRepository
import com.loki.hilt.data.remote.MyApi
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor (
    private val api: MyApi,
    private val application: Application
): MyRepository {

    init {
        val appName = application.getString(R.string.app_name)
        println("Hello from repository. The app is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}