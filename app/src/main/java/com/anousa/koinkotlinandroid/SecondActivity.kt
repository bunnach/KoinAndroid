package com.anousa.koinkotlinandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anousa.koinkotlinandroid.viewmodel.MyViewModel
import org.koin.android.ext.android.inject

class SecondActivity : AppCompatActivity() {

    private val myViewModel: MyViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, myViewModel.getName(), Toast.LENGTH_LONG).show()
    }
}
