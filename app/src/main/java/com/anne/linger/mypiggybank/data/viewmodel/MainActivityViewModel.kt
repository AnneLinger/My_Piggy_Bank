package com.anne.linger.mypiggybank.data.viewmodel

import androidx.lifecycle.ViewModel
import com.anne.linger.mypiggybank.data.model.PiggyBank
import com.anne.linger.mypiggybank.data.repository.PiggyBankRepository
import com.anne.linger.mypiggybank.data.repository.PiggyBankRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 *Created by Anne Linger on 21/10/2022.
 */

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val piggyBankRepository: PiggyBankRepositoryImpl) : ViewModel() {

    suspend fun createPiggyBank(piggyBank: PiggyBank) {
        piggyBankRepository.insertPiggyBank(piggyBank)
    }

    fun getAllPiggyBank() {
        piggyBankRepository.getAllPiggyBanks()
    }

    private suspend fun addToPiggyBank(piggyBank: PiggyBank, amountToAdd: Int) {
        var piggyBankAmount = piggyBank.piggyBankAmount
        piggyBankAmount += amountToAdd
        piggyBankRepository.updatePiggyBank(piggyBank)
    }

    private suspend fun removeFromPiggyBank(piggyBank: PiggyBank, amountToRemove: Int) {
        var piggyBankAmount = piggyBank.piggyBankAmount
        piggyBankAmount -= amountToRemove
        piggyBankRepository.updatePiggyBank(piggyBank)
    }
}