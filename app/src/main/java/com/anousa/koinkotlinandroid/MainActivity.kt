package com.anousa.koinkotlinandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anousa.koinkotlinandroid.constants.Constants
import com.anousa.koinkotlinandroid.model.Car
import com.anousa.koinkotlinandroid.model.PetrolEngine
import com.anousa.koinkotlinandroid.preference.MyPreference
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class MainActivity : AppCompatActivity() {

    private val mainActivityScope: Scope = getKoin().createScope(Constants.ACTIVITY_SCOPE_ID, named(Constants.ACTIVITY_SCOPE))
    private val myPreference: MyPreference by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getKoin().setProperty(PetrolEngine.horsePower_ID, 99999)

        myPreference.setName("Anounsa")

        val car1 = mainActivityScope.get<Car>()
        car1.drive()

        Toast.makeText(this, "Name ${myPreference.getName()}", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        mainActivityScope.close()
    }
}
