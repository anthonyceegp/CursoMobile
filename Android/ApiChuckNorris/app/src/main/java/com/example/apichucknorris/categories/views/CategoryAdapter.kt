package com.example.apichucknorris.categories.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apichucknorris.R

class CategoryAdapter(
    private val categories: List<String>,
    private val onCategoryClickListener: OnCategoryClickListener
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.categories_item, parent, false)

        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.bind(category, onCategoryClickListener)
    }

    override fun getItemCount() = categories.size

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val categoryName: TextView = view.findViewById(R.id.category_name)

        fun bind(category: String, onCategoryClickListener: OnCategoryClickListener) {
            categoryName.text = category.capitalize()

            itemView.setOnClickListener {
                onCategoryClickListener.onCategoryClick(adapterPosition)
            }
        }
    }
}