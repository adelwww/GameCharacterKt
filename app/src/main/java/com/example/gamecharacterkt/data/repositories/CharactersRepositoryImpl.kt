package com.example.gamecharacterkt.data.repositories


import com.example.gamecharacterkt.data.dtos.characterdto.toDomain
import com.example.gamecharacterkt.data.remote.apiservices.CharacterApiService
import com.example.gamecharacterkt.data.repositories.base.BaseRepository
import com.example.gamecharacterkt.domain.repositories.CharacterRepository
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val service: CharacterApiService
) : BaseRepository(), CharacterRepository {

    override fun fetchCharacter() = doRequest {
        service.fetchCharacters().amiibo.map { it.toDomain() }
    }

}