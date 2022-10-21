package com.anne.linger.mypiggybank.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Injection of Hilt in the app
 */

@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}