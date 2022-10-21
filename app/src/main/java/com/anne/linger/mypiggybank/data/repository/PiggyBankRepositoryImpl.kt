package com.anne.linger.mypiggybank.data.repository

import com.anne.linger.mypiggybank.data.dao.PiggyBankDao
import com.anne.linger.mypiggybank.data.model.PiggyBank
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 *Created by Anne Linger on 21/10/2022.
 */

class PiggyBankRepositoryImpl @Inject constructor(private val piggyBankDao: PiggyBankDao) : PiggyBankRepository {
    override suspend fun insertPiggyBank(piggyBank: PiggyBank) {
        piggyBankDao.insertPiggyBank(piggyBank)
    }

    override fun getAllPiggyBanks(): Flow<List<PiggyBank>> {
        return piggyBankDao.getAllPiggyBanks()
    }

    override suspend fun updatePiggyBank(piggyBank: PiggyBank) {
        piggyBankDao.updatePiggyBank(piggyBank)
    }
}