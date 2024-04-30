package com.adso.listadomiusic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adso.listadomiusic.adapter.RecyclerViewAdapter
import com.adso.listadomiusic.data.DataSource
import com.adso.listadomiusic.databinding.ActivityMainBinding
import com.adso.listadomiusic.model.Album

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var miRecycler : RecyclerView
    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    //var album1: Album = Album("post mortem","2020", "https://pbs.twimg.com/media/Fb1OU-8WAAMCn-a.jpg")

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


        miAdapter.setOnItemClickListener(object :RecyclerViewAdapter.onItemClickListener{
            override fun onItemClickListener(position: Int) {
                val intent = Intent(this@MainActivity, DetalleActivity::class.java)
                intent.putExtra("imagen", DataSource().getAlbumes()[position].imagen)
                intent.putExtra("imagen", DataSource().getAlbumes()[position].nombre)
                intent.putExtra("imagen", DataSource().getAlbumes()[position].fecha)
                startActivity(intent)
                Log.d("Info album", DataSource().getAlbumes()[position].toString())
            }
        })
    }

}