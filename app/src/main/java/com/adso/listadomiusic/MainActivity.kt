package com.adso.listadomiusic

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adso.listadomiusic.adapter.RecyclerViewAdapter
import com.adso.listadomiusic.data.DataSource
import com.adso.listadomiusic.databinding.ActivityMainBinding
import com.adso.listadomiusic.model.Album
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    var albumes: MutableList<Album> = mutableListOf()
    private lateinit var binding : ActivityMainBinding
    lateinit var miRecycler : RecyclerView
    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    var album1: Album = Album("post mortem","2020", "https://pbs.twimg.com/media/Fb1OU-8WAAMCn-a.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cargarRecycler()
    }
    fun cargarRecycler(){
        miRecycler = binding.datosAlbumes
        miRecycler.setHasFixedSize(true)
        miRecycler.layoutManager = LinearLayoutManager(this)
        miAdapter.RecyclerViewAdapter(DataSource().getAlbumes(), this)
        miRecycler.adapter = miAdapter
    }

}