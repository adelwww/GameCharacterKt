package com.example.gamecharacterkt.presentation.ui.fragments

import com.example.gamecharacterkt.domain.models.toUI
import com.example.gamecharacterkt.domain.usecase.FetchCharactersUseCase
import com.example.gamecharacterkt.presentation.base.BaseViewModel
import com.example.gamecharacterkt.presentation.ui.modelsui.CharacterModelUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val fetchCharactersUseCase: FetchCharactersUseCase
): BaseViewModel() {

    private val _characterState = mutableUIStateFlow<List<CharacterModelUI>>()
    val characterState = _characterState.asStateFlow()

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        fetchCharactersUseCase().collectRequest(_characterState) { it.map { it.toUI() }}
    }
}