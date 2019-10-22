package com.anousa.koinkotlinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anousa.koinkotlinandroid.model.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val car1: Car by inject()
    val car2: Car by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car1.drive()
        car2.drive()
    }
}
