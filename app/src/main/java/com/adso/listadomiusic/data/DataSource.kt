package com.adso.listadomiusic.data

import com.adso.listadomiusic.model.Album

class DataSource {
    fun getAlbumes(): MutableList<Album>{
        var albumes: MutableList<Album> = mutableListOf()
        albumes.add(Album("Post mortem","2020","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))
        albumes.add(Album("Post mortem","2020","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))
        albumes.add(Album("Post mortem","2020","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))
        albumes.add(Album("Post mortem","2020","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))
        albumes.add(Album("Post mortem","2020","https://s.france24.com/media/display/140ab902-f258-11e8-883d-005056bff430/w:980/p:16x9/ronaldo_juventus_fichaje.jpg"))
        return albumes
    }
}