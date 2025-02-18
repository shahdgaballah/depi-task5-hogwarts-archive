package com.example.apitest.data.networking.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable

data class APIWand(
    @SerialName("wood"   ) var wood   : String? = null,
    @SerialName("core"   ) var core   : String? = null,
    @SerialName("length" ) var length : Double?    = null
)
