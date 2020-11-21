package com.example.apichucknorris.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkUtils {
    private const val BASE_URL = "https://api.chucknorris.io/jokes/"

    fun getApiService(): ApiEndpoint {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiEndpoint::class.java)
    }
}