package com.example.apitest.domain

import com.example.apitest.data.db.DBHarryPotterCharacter
import com.example.apitest.data.networking.model.APIHarryPotterCharactersResponse

interface HarryPotterRepository {
    suspend fun getAllCharacters(): List<APIHarryPotterCharactersResponse>
    suspend fun addToFavorite(character: DBHarryPotterCharacter)
    suspend fun removeFromFavorite(character: DBHarryPotterCharacter)
    suspend fun getFavoriteCharacters(): List<DBHarryPotterCharacter>
}