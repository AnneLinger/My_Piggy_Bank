package com.anne.linger.mypiggybank.di

import com.anne.linger.mypiggybank.data.dao.PiggyBankDao
import com.anne.linger.mypiggybank.data.repository.PiggyBankRepository
import com.anne.linger.mypiggybank.data.repository.PiggyBankRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *Created by Anne Linger on 21/10/2022.
 */

@Module
@InstallIn(SingletonComponent::class)
class PiggyBankModule {
    @Singleton
    @Provides
    fun providePiggyBankRepository(piggyBankDao: PiggyBankDao): PiggyBankRepository = PiggyBankRepositoryImpl(piggyBankDao)
}