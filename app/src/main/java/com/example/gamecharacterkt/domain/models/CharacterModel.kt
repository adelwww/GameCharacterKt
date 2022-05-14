package com.example.gamecharacterkt.domain.models

import com.example.gamecharacterkt.presentation.ui.modelsui.CharacterModelUI

data class CharacterModel(
    val name: String,
    val image: String
)
fun CharacterModel.toUI() = CharacterModelUI(name, image)
