package com.example.gamecharacterkt.presentation.models

import com.example.domain.models.CharacterModel
import com.example.gamecharacterkt.presentation.base.IBaseDiffModel


data class CharacterModelUI (
    val name: String,
    val image: String
) : IBaseDiffModel("1")

fun CharacterModel.toUI() = CharacterModelUI(name, image)


