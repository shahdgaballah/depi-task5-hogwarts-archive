package com.example.apitest.domain

import android.content.Context
import com.example.apitest.data.db.DBHarryPotterCharacter
import com.example.apitest.data.db.HarryPotterDatabase
import com.example.apitest.data.networking.RetrofitClient
import com.example.apitest.data.networking.model.APIHarryPotterCharactersResponse



class HarryPotterRepositoryImp (context : Context): HarryPotterRepository{
    val dao = HarryPotterDatabase.getInstance(context).harryPotterCharactersDao()
    override suspend fun getAllCharacters(): List<APIHarryPotterCharactersResponse> {
        return RetrofitClient.api.getCharacters()
    }

    override suspend fun addToFavorite(character: DBHarryPotterCharacter) {
        return dao.addToFavourite(character)
    }


    override suspend fun removeFromFavorite(character: DBHarryPotterCharacter) {
        return dao.removeFromFavourite(character)
    }

    override suspend fun getFavoriteCharacters(): List<DBHarryPotterCharacter> {
        return dao.getAll()
    }

}