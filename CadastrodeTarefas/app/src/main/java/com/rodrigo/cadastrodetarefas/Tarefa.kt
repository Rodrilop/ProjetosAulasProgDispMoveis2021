package com.rodrigo.cadastrodetarefas

import android.graphics.Bitmap

class Tarefa (
    var foto: Bitmap?=null,
    var nomeTarefa: String,
    var descricao: String,
    var prioridade: Prioridade,
    var perfil: Perfil,
    var urgente: Boolean
)