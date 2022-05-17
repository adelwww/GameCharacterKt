package com.example.data.remote.apiservices

import com.example.data.remote.characterdto.CharacterResponseDto

interface CharacterApiService {

    @GET("/api/amiibo")
    suspend fun fetchCharacters(): CharacterResponseDto

}
