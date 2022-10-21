package com.anne.linger.mypiggybank.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.anne.linger.mypiggybank.data.viewmodel.MainActivityViewModel
import com.anne.linger.mypiggybank.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 *Created by Anne Linger on 21/10/2022.
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)
        initUI()
        initViewModel()
    }

    private fun initUI() {
        setSupportActionBar(mBinding.toolbar)
    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
    }
}