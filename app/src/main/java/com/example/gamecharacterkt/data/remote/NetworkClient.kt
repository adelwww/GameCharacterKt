package com.example.gamecharacterkt.data.remote

import com.example.gamecharacterkt.data.remote.apiservices.CharacterApiService
import com.example.gamecharacterkt.data.remote.retrofit.OkHttp
import com.example.gamecharacterkt.data.remote.retrofit.RetrofitClient
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttp: OkHttp
) {
    private val provideRetrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())

    fun provideCharactersApiService(): CharacterApiService =provideRetrofit.create()

    inline fun <reified T : Any> Retrofit.create(): T {
        return create(T::class.java)
    }

}