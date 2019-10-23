package com.anousa.koinkotlinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.model.Car
import org.koin.android.ext.android.getKoin
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class MainActivity : AppCompatActivity() {

    private val mainActivityScope: Scope = getKoin().createScope(Constants.ACTIVITY_SCOPE_ID, named(Constants.ACTIVITY_SCOPE))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = mainActivityScope.get<Car>()
        car1.drive()

    }

    override fun onDestroy() {
        super.onDestroy()
        mainActivityScope.close()
    }
}
