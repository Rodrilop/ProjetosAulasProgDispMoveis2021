package com.rodrigo.listapets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Pet>(
            Pet(nome="Buzzi", animal= AnimalEnum.GATO, color= ColorEnum.MARROM, foto=resources.getDrawable(R.drawable.gato_marrom)),
            Pet(nome="Dory", animal= AnimalEnum.PEIXE, color= ColorEnum.COLORIDO, foto=resources.getDrawable(R.drawable.peixe_colorido)),
            Pet(nome="Billy", animal= AnimalEnum.CACHORRO, color= ColorEnum.PRETO, foto=resources.getDrawable(R.drawable.cao_preto)),
        )

        rv.adapter = PetAdapter(lista)

        // Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)
    }
}