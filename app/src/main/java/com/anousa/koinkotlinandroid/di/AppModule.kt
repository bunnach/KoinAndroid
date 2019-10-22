package com.anousa.koinkotlinandroid.di

import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.model.Car

import com.anousa.koinkotlinandroid.model.Driver
import com.anousa.koinkotlinandroid.model.Engine
import com.anousa.koinkotlinandroid.model.Wheel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    factory { Wheel() }
    factory { Engine() }
    scope(named(Constants.ACTIVITY_SCOPE)) {
        scoped { Car(get(), get(), get()) }
    }
    single { Driver() }
}