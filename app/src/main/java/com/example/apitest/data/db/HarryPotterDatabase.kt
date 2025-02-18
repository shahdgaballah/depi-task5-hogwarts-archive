package com.example.apitest.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

class HarryPotterDatabase {

    @Database(
        entities = [DBHarryPotterCharacter::class],
        version = 1,
        exportSchema = false
    )
    abstract class HarryPotterDatabase : RoomDatabase() {
        abstract fun harryPotterCharactersDao(): HarryPotterCharactersDao

        companion object {
            @Volatile
            private var INSTANCE: HarryPotterDatabase? = null

            fun getInstance(context: android.content.Context): HarryPotterDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        HarryPotterDatabase::class.java,
                        "harry_potter_database"
                    ).build()
                    INSTANCE = instance
                    instance
                }
            }
        }
    }
