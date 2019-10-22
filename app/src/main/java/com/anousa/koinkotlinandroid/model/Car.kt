package com.anousa.koinkotlinandroid.model

import android.util.Log
import com.anousa.koinkotlinandroid.constants.Constants

class Car(val engine: Engine, val wheel: Wheel) {

    fun drive() {
        Log.d(Constants.TAG, "car is driving...$this")
    }

}