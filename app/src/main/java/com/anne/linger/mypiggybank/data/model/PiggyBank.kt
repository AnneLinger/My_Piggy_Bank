package com.anne.linger.mypiggybank.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *Created by Anne Linger on 18/10/2022.
 */

@Entity(tableName = "piggy_bank")
data class PiggyBank(@PrimaryKey(autoGenerate = false)
                    @ColumnInfo(name = "piggy_bank_amount")
                    val piggyBankAmount: Int)