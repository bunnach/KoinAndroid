package com.anousa.koinkotlinandroid.di

import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.model.*
import com.anousa.koinkotlinandroid.preference.MyPreference
import com.anousa.koinkotlinandroid.repository.MyRepository
import com.anousa.koinkotlinandroid.viewmodel.MyViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {

    fun provideEngine(petrolEngine: PetrolEngine): Engine {
        return  petrolEngine
    }
    factory { PetrolEngine(getProperty(PetrolEngine.horsePower_ID)) }
    factory { Wheel() }
    scope(named(Constants.ACTIVITY_SCOPE)) {
        scoped { Car(get(), get(), get()) }
    }
    single { Driver() }
    factory { provideEngine(get()) }

    factory { MyPreference(androidContext()) }
//    factory { MyPreference(androidApplication()) }
}

val viewModelModule = module {
//    single { MyRepository(get()) } // only one instance whole app
    factory { MyRepository(get()) } // always news instance when MyViewModel object created
    viewModel { MyViewModel(get()) }
}