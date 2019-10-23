package com.anousa.koinkotlinandroid

import android.app.Application
import com.anousa.koinkotlinandroid.di.appModule
import com.anousa.koinkotlinandroid.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.INFO)
            androidContext(this@MyApplication)
            modules(listOf(appModule, viewModelModule))
        }
    }

}