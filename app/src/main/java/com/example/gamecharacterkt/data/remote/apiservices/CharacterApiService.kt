package com.example.gamecharacterkt.data.remote.apiservices

import com.example.gamecharacterkt.data.dtos.characterdto.CharacterResponseDto
import retrofit2.http.GET

interface CharacterApiService {

    @GET("/api/amiibo")
    suspend fun fetchCharacters(): CharacterResponseDto

}
