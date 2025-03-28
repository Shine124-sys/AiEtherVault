package com.example.aiethervault.api

object RetrofitClient {
    private const val BASE_URL = "https://graph.facebook.com/v12.0/"

    val api: FacebookApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FacebookApi::class.java)
    }
}
