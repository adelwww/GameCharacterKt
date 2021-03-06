package com.example.gamecharacterkt.di

import com.example.data.repositories.CharactersRepositoryImpl
import com.example.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun provideCharacterRepository(repositoryImpl: CharactersRepositoryImpl): CharacterRepository

}