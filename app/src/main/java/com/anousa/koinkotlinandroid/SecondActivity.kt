package com.anousa.koinkotlinandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anousa.koinkotlinandroid.viewmodel.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity : AppCompatActivity() {

    private val myViewModel: MyViewModel by viewModel()
    private val myViewModel1: MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, myViewModel.getName(), Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Bunna ${myViewModel1.getName()}", Toast.LENGTH_LONG).show()
    }
}
