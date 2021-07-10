package com.rodrigo.tarefas30.data.model

import com.google.gson.annotations.SerializedName

data class Tarefa(
    @SerializedName("id") var id: Int=0,
    @SerializedName("nome") val nome: String
)