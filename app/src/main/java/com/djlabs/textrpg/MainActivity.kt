package com.djlabs.textrpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.djlabs.textrpg.fragment.MainMenuFragment

class MainActivity : AppCompatActivity() {

    lateinit var ft : FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ft = getSupportFragmentManager().beginTransaction()

        openMainMenu()
    }

    fun openMainMenu() {
       ft.replace(R.id.main_frame, MainMenuFragment()).commit()
    }

    fun openOpponentsSelection() {

    }
}
