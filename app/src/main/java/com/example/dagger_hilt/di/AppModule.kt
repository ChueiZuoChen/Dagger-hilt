package com.example.dagger_hilt.di

import android.app.Application
import com.example.dagger_hilt.data.remote.MyApi
import com.example.dagger_hilt.data.repository.MyRepositoryImpl
import com.example.dagger_hilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Named("hello1")
    @Provides
    @Singleton
    fun provideString1() = "Hello 1"

    @Named("hello2")
    @Provides
    @Singleton
    fun provideString2() = "Hello 2"
}