package com.example.apitest.data.networking.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class APIHarryPotterCharactersResponse(
    @SerialName("id") var id : String? = null,
    @SerialName("name") var name : String? = null,
    @SerialName("alternate_names"  ) var alternateNames  : ArrayList<String> = arrayListOf(),
    @SerialName("species"          ) var species         : String?           = null,
    @SerialName("gender"           ) var gender          : String?           = null,
    @SerialName("house"            ) var house           : String?           = null,
    @SerialName("dateOfBirth"      ) var dateOfBirth     : String?           = null,
    @SerialName("yearOfBirth"      ) var yearOfBirth     : Int?              = null,
    @SerialName("wizard"           ) var wizard          : Boolean?          = null,
    @SerialName("ancestry"         ) var ancestry        : String?           = null,
    @SerialName("eyeColour"        ) var eyeColour       : String?           = null,
    @SerialName("hairColour"       ) var hairColour      : String?           = null,
    @SerialName("wand"             ) var wand            : APIWand?            = APIWand(),
    @SerialName("patronus"         ) var patronus        : String?           = null,
    @SerialName("hogwartsStudent"  ) var hogwartsStudent : Boolean?          = null,
    @SerialName("hogwartsStaff"    ) var hogwartsStaff   : Boolean?          = null,
    @SerialName("actor"            ) var actor           : String?           = null,
    @SerialName("alternate_actors" ) var alternateActors : ArrayList<String> = arrayListOf(),
    @SerialName("alive"            ) var alive           : Boolean?          = null,
    @SerialName("image"            ) var image           : String?           = null

)
