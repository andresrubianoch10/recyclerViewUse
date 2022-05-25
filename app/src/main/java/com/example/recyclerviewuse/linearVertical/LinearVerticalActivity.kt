package com.example.recyclerviewuse.linearVertical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewuse.commons.Movie
import com.example.recyclerviewuse.databinding.ActivityLinearVerticalBinding

class LinearVerticalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLinearVerticalBinding

    private lateinit var adapterMovies: MovieLinearVerticalAdapter

    private val data = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        initData()
    }

    private fun initRecyclerView() {
        adapterMovies = MovieLinearVerticalAdapter(data)
        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@LinearVerticalActivity)
            adapter = adapterMovies

        }
    }

    private fun initData() {
        val newData = getData()
        data.clear()
        data.addAll(newData)
        adapterMovies.notifyDataSetChanged()
    }

    private fun getData(): List<Movie> {
        return listOf(
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            )
        )
    }
}