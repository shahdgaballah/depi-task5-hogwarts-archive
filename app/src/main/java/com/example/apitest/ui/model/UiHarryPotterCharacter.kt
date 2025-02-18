package com.example.apitest.ui.model

import com.example.apitest.data.networking.model.APIHarryPotterCharactersResponse

data class UiHarryPotterCharacter(
    val id: String,
    val name: String,
    val house: String,
    val image: String,
){
    companion object {
        val dummy = UiHarryPotterCharacter(
            id = "1",
            name = "Harry Potter",
            house = "Gryffindor",
            image = "https://hp-api.onrender.com/images/harry.jpg",
        )
    }
}


fun APIHarryPotterCharactersResponse.toUiHarryPotterCharacter() =
    UiHarryPotterCharacter(
        id = id.orEmpty(),
        name = name.orEmpty(),
        house = house.orEmpty(),
        image = image.orEmpty(),
    )