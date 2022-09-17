package com.example.dagger_hilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}