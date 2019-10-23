package com.anousa.koinkotlinandroid.model

import android.util.Log
import com.anousa.koinkotlinandroid.constants.Constants

class PetrolEngine: Engine {
    override fun start() {
        Log.d(Constants.TAG, "Petrol Engine started...")
    }
}