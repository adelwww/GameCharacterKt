package com.example.data.remote.characterdto

import com.example.domain.models.CharacterModel
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


