package com.rodrigo.listatarefas

import android.graphics.drawable.Drawable

data class Tarefa(
    var image: Drawable?=null,
    var title: String,
    var content: String,
)
