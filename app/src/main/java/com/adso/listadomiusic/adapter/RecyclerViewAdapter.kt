package com.adso.listadomiusic.adapter


import android.content.Context
import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adso.listadomiusic.R
import com.adso.listadomiusic.model.Album
import com.bumptech.glide.Glide
import kotlin.math.hypot

class RecyclerViewAdapter:
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    var albumes: MutableList<Album> = ArrayList()
    lateinit var  context: Context
    lateinit var miListener: onItemClickListener
    fun RecyclerViewAdapter(albumes: MutableList<Album>,context: Context){
        this.albumes = albumes
        this.context = context
    }
    class ViewHolder(view: View, listener: onItemClickListener): RecyclerView.ViewHolder(view){
        val albumNombre = view.findViewById<TextView>(R.id.txtNombre)
        val albumFecha = view.findViewById<TextView>(R.id.txtFecha)
        val albumFoto = view.findViewById<ImageView>(R.id.imvImage)
        fun bind(album: Album, context: Context){
            albumNombre.text = album.nombre
            albumFecha.text = album.fecha
            albumFoto.loadImage(album.imagen)
        }
        fun ImageView.loadImage(url:String){
            Glide.with(context).load(url).into(this)
        }
        init{
            view.setOnClickListener{
                listener.onItemClickListener(bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ViewHolder {

        return ViewHolder(LayoutInflater.from(context).
        inflate(R.layout.item_album, parent ,false), miListener)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {

        val item = albumes.get(position)
        holder.bind(item,context)
    }

    override fun getItemCount(): Int {

        return albumes.size
    }

    interface onItemClickListener{
        fun onItemClickListener(position: Int)

    }
    fun setOnItemClickListener(listener:onItemClickListener){
        miListener = listener
    }
}