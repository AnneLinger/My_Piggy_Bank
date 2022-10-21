package com.anne.linger.mypiggybank.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anne.linger.mypiggybank.data.dao.PiggyBankDao
import com.anne.linger.mypiggybank.data.model.PiggyBank

/**
 *Created by Anne Linger on 21/10/2022.
 */

@Database(entities = [PiggyBank::class], version = 1, exportSchema = false)
abstract class MyPiggyBankDatabase : RoomDatabase() {
    abstract fun piggyBankDao(): PiggyBankDao
}