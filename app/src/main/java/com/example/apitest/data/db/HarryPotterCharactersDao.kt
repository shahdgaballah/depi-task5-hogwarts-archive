package com.example.apitest.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface HarryPotterCharactersDao {
    @Query("SELECT * FROM DBHarryPotterCharacter")
    suspend fun getAll(): List<DBHarryPotterCharacter>

    @Upsert
    fun addToFavourite(character: DBHarryPotterCharacter)

    @Delete
    fun removeFromFavourite(character: DBHarryPotterCharacter)
}