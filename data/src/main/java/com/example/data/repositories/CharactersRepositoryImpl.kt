package com.example.data.repositories


import com.example.data.remote.characterdto.toDomain
import com.example.data.remote.apiservices.CharacterApiService
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.CharacterRepository
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val service: CharacterApiService
) : BaseRepository(), CharacterRepository {

    override fun fetchCharacter() = doRequest {
        service.fetchCharacters().amiibo.map { it.toDomain() }
    }

}