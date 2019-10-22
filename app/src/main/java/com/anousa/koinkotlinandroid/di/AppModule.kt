package com.anousa.koinkotlinandroid.di

import com.anousa.koinkotlinandroid.model.Car
import com.anousa.koinkotlinandroid.model.Engine
import com.anousa.koinkotlinandroid.model.Wheel
import org.koin.dsl.module.module

val appModule = module {
    factory { Wheel() }
    factory { Engine() }
    single { Car(get(), get()) }
}