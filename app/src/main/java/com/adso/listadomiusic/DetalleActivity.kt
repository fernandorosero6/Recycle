package com.adso.listadomiusic

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.adso.listadomiusic.databinding.ActivityDetalleBinding
import com.bumptech.glide.Glide


class DetalleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetalleBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        cargarDetalle()
    }

    private fun cargarDetalle() {
        var nombre: String = intent.getStringExtra("album").toString()
        var fecha: String = intent.getStringExtra("fecha").toString()
        var foto = intent.getStringExtra("imagen")

        binding.imvImage.loadImage(foto.toString())

        binding.txtNombre.text = nombre
        binding.txtFecha.text = fecha

    }

    fun ImageView.loadImage(url:String) {
        Glide.with(context).load(url).into(this)
    }


}