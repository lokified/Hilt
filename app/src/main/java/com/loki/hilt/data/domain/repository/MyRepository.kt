package com.loki.hilt.data.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}