package com.anousa.koinkotlinandroid.model

import android.util.Log
import com.anousa.koinkotlinandroid.constants.Constants

class PetrolEngine(val horsePower: Int): Engine {

    companion object {
        val horsePower_ID = "horsePower_ID"
    }

    override fun start() {
        Log.d(Constants.TAG, "Petrol Engine started... horse power $horsePower")
    }
}