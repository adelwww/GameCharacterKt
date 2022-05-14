package com.example.gamecharacterkt.domain.repositories

import com.example.gamecharacterkt.domain.either.Either
import com.example.gamecharacterkt.domain.models.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun fetchCharacter() : Flow<Either<String, List<CharacterModel>>>

}