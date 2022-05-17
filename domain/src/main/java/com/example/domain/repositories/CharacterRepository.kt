package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun fetchCharacter() : Flow<Either<String, List<CharacterModel>>>

}