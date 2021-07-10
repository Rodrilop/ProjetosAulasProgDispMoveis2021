package com.rodrigo.seugithub.domain

import com.rodrigo.seugithub.data.model.Github
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("{login}")
    suspend fun buscarUsuario(
        @Path("login") usuario : String
    ) : Response<Github>
}