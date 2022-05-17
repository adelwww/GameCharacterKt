package com.example.gamecharacterkt.di

import com.example.data.remote.NetworkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Singleton
    @Provides
    fun provideCharacterApiService(
        networkClient: NetworkClient
    ) = networkClient.provideCharactersApiService()

}