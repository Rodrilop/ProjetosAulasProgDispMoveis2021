package com.rodrigo.seugithub

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide
import com.rodrigo.seugithub.domain.GithubService
import com.rodrigo.seugithub.util.Network
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    private lateinit var campoLogin: EditText
    private lateinit var botaoLogin: Button
    private lateinit var respostaLogin: TextView
    private lateinit var carregamentoLogin: ProgressBar
    private lateinit var avatar: ImageView
    private lateinit var corfundo: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoLogin = findViewById(R.id.edtLogin)
        botaoLogin = findViewById(R.id.btnBuscarUsuario)
        respostaLogin = findViewById(R.id.txtUserResponse)
        carregamentoLogin = findViewById(R.id.prgLoading)
        avatar = findViewById(R.id.avatar)
        corfundo = findViewById(R.id.corfundo)
        corfundo.visibility = View.INVISIBLE

        botaoLogin.setOnClickListener{
            val usuario = campoLogin.text.toString()
            if(usuario.isNotEmpty()){
                buscarUsuario(usuario)
            } else {
                campoLogin.error = "Digite um usuário válido"
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun buscarUsuario(login: String){
        val retrofitClient = Network.retrofitConfig("https://api.github.com/users/")
        val servico = retrofitClient.create(GithubService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = servico.buscarUsuario(login)

                withContext(Dispatchers.Main){
                    changeLoadingVisibility(isVisible = true)
                    delay(2000L)
                    if(response.isSuccessful){
                        changeLoadingVisibility(isVisible = false)
                        respostaLogin.text = response.body().toString()
                        Glide.with(this@MainActivity).load(response.body()?.picToString()).into(avatar)

                        corfundo.visibility = View.VISIBLE
                    }
                }
            }catch (e: Exception){
                withContext(Dispatchers.Main){
                    changeLoadingVisibility(isVisible = false)
                    respostaLogin.text = "Não foi possível processar a sua solicitação."
                }
            }
        }
    }
    private fun changeLoadingVisibility(isVisible: Boolean){
        if(isVisible){
            respostaLogin.text = ""
            carregamentoLogin.visibility = View.VISIBLE
            botaoLogin.visibility = View.INVISIBLE
            avatar.visibility = View.INVISIBLE
            corfundo.visibility = View.INVISIBLE

        } else {
            carregamentoLogin.visibility = View.INVISIBLE
            botaoLogin.visibility = View.VISIBLE
            avatar.visibility = View.VISIBLE
            corfundo.visibility = View.VISIBLE
        }
    }
}