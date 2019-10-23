package com.anousa.koinkotlinandroid.preference

import android.content.Context
import android.content.SharedPreferences

class MyPreference(context: Context) {

    val NAME = "NAME"
    val myPreference: SharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    fun setName(name: String) {
        myPreference.edit().putString(NAME, name).apply()
    }

    fun getName() = myPreference.getString(NAME, "")
}