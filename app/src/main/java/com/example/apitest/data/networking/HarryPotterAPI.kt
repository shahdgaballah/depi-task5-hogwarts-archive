package com.example.apitest.data.networking

import com.example.apitest.data.networking.model.APIHarryPotterCharactersResponse
import retrofit2.http.GET

//https://hp-api.onrender.com/api/ BASE URL

interface HarryPotterAPI {
    @GET("Characters")
    suspend fun getCharacters(): List<APIHarryPotterCharactersResponse>
}