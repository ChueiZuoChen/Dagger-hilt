package com.example.dagger_hilt.data.repository

import android.app.Application
import com.example.dagger_hilt.R
import com.example.dagger_hilt.data.remote.MyApi
import com.example.dagger_hilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("repository app name: $appName")
    }

    override suspend fun doNetworkCall() {

    }
}