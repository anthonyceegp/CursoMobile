package com.example.apichucknorris.joke.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.apichucknorris.joke.respository.JokeRepository
import kotlinx.coroutines.Dispatchers

class JokeViewModel(
   private val repository: JokeRepository
) : ViewModel() {

    fun getRandomJoke(category: String) = liveData(Dispatchers.IO) {
        val response = repository.getRandomJoke(category)
        emit(response)
    }

    class JokeViewModelFactory(
        private val repository: JokeRepository
    ) : ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return JokeViewModel(repository) as T
        }
    }
}