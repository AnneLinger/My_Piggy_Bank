package com.anne.linger.mypiggybank.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.anne.linger.mypiggybank.data.model.PiggyBank
import kotlinx.coroutines.flow.Flow

/**
 *Created by Anne Linger on 21/10/2022.
 */

@Dao
interface PiggyBankDao {
    @Insert
    suspend fun insertPiggyBank(piggyBank: PiggyBank)

    @Query("SELECT * FROM piggy_bank")
    fun getAllPiggyBanks(): Flow<List<PiggyBank>>

    @Update
    suspend fun updatePiggyBank(piggyBank: PiggyBank)
}