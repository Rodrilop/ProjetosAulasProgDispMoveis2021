package com.rodrigo.listadecompras

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.rodrigo.listadecompras.Compra

@Dao
interface CompraDAO {
    @Query("SELECT * FROM TB_Compra")
    suspend fun getCompras(): List<Compra>

    @Insert
    suspend fun addCompras(t: Compra)

    @Delete
    suspend fun deleteCompra(t: Compra)
}