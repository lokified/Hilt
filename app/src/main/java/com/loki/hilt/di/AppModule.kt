package com.loki.hilt.di

import android.app.Application
import com.loki.hilt.data.domain.repository.MyRepository
import com.loki.hilt.data.remote.MyApi
import com.loki.hilt.data.remote.repository.MyRepositoryImpl
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
        return Retrofit.Builder().
                baseUrl("https://test.com").
                build().
                create(MyApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideRepository(
//        api: MyApi,
//        application: Application,
//        @Named("hello1") hello1: String
//    ): MyRepository {
//
//        return MyRepositoryImpl(api, application)
//    }
//
    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"


    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}