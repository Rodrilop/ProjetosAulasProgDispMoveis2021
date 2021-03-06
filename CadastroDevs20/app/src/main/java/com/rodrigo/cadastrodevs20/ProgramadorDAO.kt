package com.rodrigo.cadastrodevs20

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.rodrigo.cadastrodevs20.Programador

@Dao
interface ProgramadorDAO {
    @Query("SELECT * FROM TB_Programador")
    suspend fun getProgramadores(): List<Programador>

    @Insert
    suspend fun addProgramadores(t: Programador)

    @Delete
    suspend fun deleteProgramador(t: Programador)
}