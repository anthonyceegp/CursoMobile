package com.example.apichucknorris.categories.repository

import com.example.apichucknorris.api.NetworkUtils

class CategoryRepository {
    private val categoryService = NetworkUtils.getApiService()

    suspend fun getCategories() = categoryService.getCategories()
}