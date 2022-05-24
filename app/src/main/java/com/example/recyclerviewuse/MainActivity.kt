package com.example.recyclerviewuse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewuse.databinding.ActivityMainBinding
import com.example.recyclerviewuse.gridLayout.GridActivity
import com.example.recyclerviewuse.linearHorizontal.LinearHorizontalActivity
import com.example.recyclerviewuse.linearVertical.LinearVerticalActivity
import com.example.recyclerviewuse.staggeredGrid.StaggeredGridActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        with(binding) {
            buttonNavigationLinearVertical.setOnClickListener { goToLinearVertical() }
            buttonNavigationLinearHorizontal.setOnClickListener { goToHorizontalVertical() }
            buttonNavigationGridLayoutManager.setOnClickListener { goToGridLayout() }
            buttonNavigationStaggeredGridLayout.setOnClickListener { goToStaggeredLayout() }
        }
    }

    private fun goToStaggeredLayout() {
        val intent = Intent(this, StaggeredGridActivity::class.java)
        openIntent(intent)
    }

    private fun goToGridLayout() {
        val intent = Intent(this, GridActivity::class.java)
        openIntent(intent)
    }

    private fun goToLinearVertical() {
        val intent = Intent(this, LinearVerticalActivity::class.java)
        openIntent(intent)
    }

    private fun goToHorizontalVertical() {
        val intent = Intent(this, LinearHorizontalActivity::class.java)
        openIntent(intent)
    }

    private fun openIntent(intent: Intent) {
        startActivity(intent)
    }
}