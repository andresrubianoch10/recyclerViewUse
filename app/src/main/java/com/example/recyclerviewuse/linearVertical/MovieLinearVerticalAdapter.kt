package com.example.recyclerviewuse.linearVertical

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewuse.R
import com.example.recyclerviewuse.commons.Movie

class MovieLinearVerticalAdapter(
    val data: List<Movie>,
    val onClickListener: MovieOnClickListener
) : RecyclerView.Adapter<MovieLinearVerticalViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieLinearVerticalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieLinearVerticalViewHolder(
            layoutInflater.inflate(
                R.layout.item_view_holder_movie_linear_vertical,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieLinearVerticalViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = data.size

}

interface MovieOnClickListener {
    fun onClick(movie: Movie)
}