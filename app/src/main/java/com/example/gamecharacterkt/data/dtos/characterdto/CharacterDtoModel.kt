package com.example.gamecharacterkt.data.dtos.characterdto

import com.example.gamecharacterkt.domain.models.CharacterModel
import com.google.gson.annotations.SerializedName


data class CharacterResponseDto(
    @SerializedName("amiibo")
    val amiibo: ArrayList<CharacterDtoModel>
)
data class CharacterDtoModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)

fun CharacterDtoModel.toDomain() = CharacterModel( name, image)


