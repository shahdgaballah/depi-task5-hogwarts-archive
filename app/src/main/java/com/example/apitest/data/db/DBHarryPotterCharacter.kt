package com.example.apitest.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DBHarryPotterCharacter(
    @PrimaryKey val id: String,
    val name: String,
    val house: String,
    val image: String,
    //val isFavourite: Boolean = false,
)
