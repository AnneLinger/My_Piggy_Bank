package com.anne.linger.mypiggybank.data.repository

import com.anne.linger.mypiggybank.data.model.PiggyBank
import kotlinx.coroutines.flow.Flow

/**
 *Created by Anne Linger on 21/10/2022.
 */
interface PiggyBankRepository {
    suspend fun insertPiggyBank(piggyBank: PiggyBank)

    fun getAllPiggyBanks(): Flow<List<PiggyBank>>

    suspend fun updatePiggyBank(piggyBank: PiggyBank)
}