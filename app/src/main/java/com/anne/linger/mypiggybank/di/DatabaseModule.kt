package com.anne.linger.mypiggybank.di

import android.content.Context
import androidx.room.Room
import com.anne.linger.mypiggybank.data.database.MyPiggyBankDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *Created by Anne Linger on 21/10/2022.
 */

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(
            app,
            MyPiggyBankDatabase::class.java,
            "LocalDatabase"
        )
            .build()

    @Singleton
    @Provides
    fun providePropertyDao(database: MyPiggyBankDatabase) = database.piggyBankDao()
}