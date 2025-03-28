package com.example.aiethervault.api


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DUISApiClient {

    private const val BASE_URL = "https://api.exampleblockchain.com/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
        
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->

            val request = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer ${AuthManager.accessToken}")
                .build()
            chain.proceed(request)
        }
        .addInterceptor(loggingInterceptor)
        .build()


    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()




}
