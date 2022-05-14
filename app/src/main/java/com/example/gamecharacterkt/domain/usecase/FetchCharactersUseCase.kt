package com.example.gamecharacterkt.domain.usecase

import com.example.gamecharacterkt.domain.repositories.CharacterRepository
import javax.inject.Inject

class FetchCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {

    operator fun invoke() = repository.fetchCharacter()

}