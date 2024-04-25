package com.adso.listadomiusic.data

import com.adso.listadomiusic.model.Album

class DataSource {
    fun getAlbumes(): MutableList<Album>{
        var albumes: MutableList<Album> = mutableListOf()
        albumes.add(Album("Post mortem","2020","https://afuerablog.com/wp-content/uploads/2022/09/este-e1663322160531.webp"))
        albumes.add(Album("Post mortem","2020","https://afuerablog.com/wp-content/uploads/2022/09/este-e1663322160531.webp"))
        albumes.add(Album("Post mortem","2020","https://afuerablog.com/wp-content/uploads/2022/09/este-e1663322160531.webp"))
        albumes.add(Album("Post mortem","2020","https://afuerablog.com/wp-content/uploads/2022/09/este-e1663322160531.webp"))
        albumes.add(Album("Post mortem","2020","https://afuerablog.com/wp-content/uploads/2022/09/este-e1663322160531.webp"))
        return albumes
    }
}