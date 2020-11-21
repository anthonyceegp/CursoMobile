package com.example.apichucknorris.joke.respository

import com.example.apichucknorris.api.NetworkUtils

class JokeRepository {
    private val jokeService = NetworkUtils.getApiService()

    suspend fun getRandomJoke(category: String) = jokeService.getRandomJoke(category)
}