package com.rodrigo.seugithub.data.model

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

class Github(@SerializedName("login") val login: String,
             @SerializedName("name") val nome: String,
             @SerializedName("public_repos") val repositorios: String,
             @SerializedName("created_at") val criacao: Date,
             @SerializedName("avatar_url") val foto: String) {

    override fun toString(): String {
        val newstring: String = SimpleDateFormat("dd/MM/yyyy").format(criacao)
        println(newstring) // 2011-01-18

        return "Login: $login\nNome: $nome\nRepositórios: $repositorios\nCriado em: $newstring"
    }

    fun picToString(): String {
        return "$foto"
    }

}