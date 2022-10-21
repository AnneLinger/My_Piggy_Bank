package com.anne.linger.mypiggybank.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anne.linger.mypiggybank.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 *Created by Anne Linger on 21/10/2022.
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)
        setupUI()
    }

    private fun setupUI() {
        setSupportActionBar(mBinding.toolbar)
    }
}