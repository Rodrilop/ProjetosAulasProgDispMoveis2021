package com.rodrigo.cadastrodevs20

import androidx.room.*

@Entity(tableName = "TB_PROGRAMADOR")
data class Programador(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    @ColumnInfo(name="Nome")
    val nome: String,
)