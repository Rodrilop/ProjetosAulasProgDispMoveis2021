package com.rodrigo.listatarefas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvTarefas)

        val lista = mutableListOf<Tarefa>(
            Tarefa(title="Finalizar Curso", content="Concluir o curso de PowerBI na plataforma DSA!", image= resources.getDrawable(R.drawable.dsa, getApplicationContext().getTheme())),
            Tarefa(title="Aperfeiçoar Front", content="Dedicar uma hora por dia a aperfeiçoar meu Front com cursos", image= resources.getDrawable(R.drawable.front, getApplicationContext().getTheme())),
            Tarefa(title="Consulta", content="Retornar ao oftalmolosgista em setembro/2021", image= resources.getDrawable(R.drawable.consulta, getApplicationContext().getTheme())),
            Tarefa(title="Despesas", content="Pagar as despesas mensais até dia 10 do mês", image= resources.getDrawable(R.drawable.despesa, getApplicationContext().getTheme())),
            Tarefa(title="Alimentar Peixe", content="Alimentar peixe 3X por dia!", image= resources.getDrawable(R.drawable.peixe, getApplicationContext().getTheme())),
            Tarefa(title="Remédio", content="Usar colírio diariamente antes de dormir.", image= resources.getDrawable(R.drawable.remedio, getApplicationContext().getTheme())),
        )

        rv.adapter = TarefaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}