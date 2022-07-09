package com.example.data.remote

import com.example.data.remote.apiservices.CharacterApiService
import com.example.data.remote.retrofit.OkHttp
import com.example.data.remote.retrofit.RetrofitClient
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttp: OkHttp
) {
    private val provideRetrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())

    fun provideCharactersApiService(): CharacterApiService =provideRetrofit.create()
}