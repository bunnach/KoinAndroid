package com.anousa.koinkotlinandroid.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.repository.MyRepository

class MyViewModel(private val myRepository: MyRepository): ViewModel() {

    init {
        Log.d(Constants.TAG, "view model created $this")
    }

    fun getName() = myRepository.getName()

    override fun onCleared() {
        Log.d(Constants.TAG, "view model cleared...")
        super.onCleared()
    }
}