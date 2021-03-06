package com.example.apichucknorris.api

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("icon_url")
    val iconUrl: String,
    val id: String,
    val url: String,
    val value: String
)