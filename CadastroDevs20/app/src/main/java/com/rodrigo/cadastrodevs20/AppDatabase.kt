package com.rodrigo.cadastrodevs20


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Programador::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun programadorDao():ProgramadorDAO

    // Implementar aqui todos os DAOs que o App tiver daqui pra baixo...
}