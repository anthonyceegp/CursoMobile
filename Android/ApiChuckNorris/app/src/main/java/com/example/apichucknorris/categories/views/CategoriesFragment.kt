package com.example.apichucknorris.categories.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apichucknorris.R
import com.example.apichucknorris.categories.repository.CategoryRepository
import com.example.apichucknorris.categories.viewmodel.CategoryViewModel

class CategoriesFragment : Fragment(), OnCategoryClickListener {
    private lateinit var _categoryViewModel: CategoryViewModel
    private val _categories = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler: RecyclerView = view.findViewById(R.id.categories_recycler)
        val manager = LinearLayoutManager(view.context)
        val categoryAdapter = CategoryAdapter(_categories, this)

        recycler.apply {
            layoutManager = manager
            adapter = categoryAdapter
        }

        recycler.addItemDecoration(
            DividerItemDecoration(
                recycler.context,
                DividerItemDecoration.VERTICAL
            )
        )

        _categoryViewModel = ViewModelProvider(
            this,
            CategoryViewModel.CategoryViewModelFactory(CategoryRepository())
        ).get(CategoryViewModel::class.java)

        _categoryViewModel.getCategories().observe(viewLifecycleOwner, {
            _categories.addAll(it)
            categoryAdapter.notifyDataSetChanged()
        })
    }

    override fun onCategoryClick(position: Int) {
        val bundle = bundleOf("CATEGORY" to _categories[position])
        findNavController().navigate(R.id.jokeFragment, bundle)
    }
}