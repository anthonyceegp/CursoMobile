package com.example.apichucknorris.joke.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.apichucknorris.R
import com.example.apichucknorris.joke.respository.JokeRepository
import com.example.apichucknorris.joke.viewmodel.JokeViewModel
import com.squareup.picasso.Picasso

class JokeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_joke, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image: ImageView = view.findViewById(R.id.joke_image)
        val message: TextView = view.findViewById(R.id.joke_message)

        val joveViewModel = ViewModelProvider(
            this,
            JokeViewModel.JokeViewModelFactory(JokeRepository())
        ).get(JokeViewModel::class.java)

        val category = arguments?.getString("CATEGORY")

        joveViewModel.getRandomJoke(category!!).observe(viewLifecycleOwner, {
            Picasso.get().load(it.iconUrl).into(image)
            message.text = it.value
        })
    }
}