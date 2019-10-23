package com.anousa.koinkotlinandroid.di

import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.model.*
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {

    fun provideEngine(petrolEngine: PetrolEngine): Engine {
        return  petrolEngine
    }
    factory { PetrolEngine() }
    factory { Wheel() }
    scope(named(Constants.ACTIVITY_SCOPE)) {
        scoped { Car(get(), get(), get()) }
    }
    single { Driver() }
    factory { provideEngine(get()) }
}