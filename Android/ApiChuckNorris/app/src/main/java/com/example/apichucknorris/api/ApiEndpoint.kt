package com.example.apichucknorris.api

import android.media.MediaRouter
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndpoint {
    @GET("categories")
    suspend fun getCategories(): List<String>

    @GET("random")
    suspend fun getRandomJoke(@Query("category") category: String): ApiResponse
}