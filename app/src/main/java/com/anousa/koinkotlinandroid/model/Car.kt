package com.anousa.koinkotlinandroid.model

import android.util.Log
import com.anousa.koinkotlinandroid.constants.Constants

class Car(val driver: Driver, val engine: Engine, val wheel: Wheel) {

    fun drive() {
        Log.d(Constants.TAG, "$engine")
        engine.start()
        Log.d(Constants.TAG, "$driver drive $this")
    }

}