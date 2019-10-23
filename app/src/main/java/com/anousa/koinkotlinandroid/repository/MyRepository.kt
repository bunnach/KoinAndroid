package com.anousa.koinkotlinandroid.repository

import android.util.Log
import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.preference.MyPreference

class MyRepository(private val myPreference: MyPreference) {

    init {
        Log.d(Constants.TAG, "repository created $this")
    }

    fun getName(): String {
        return myPreference.getName()
    }

}