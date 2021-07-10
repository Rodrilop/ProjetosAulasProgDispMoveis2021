package com.rodrigo.tarefas30

import com.rodrigo.tarefas30.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}
