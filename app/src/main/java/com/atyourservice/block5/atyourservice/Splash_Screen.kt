package com.atyourservice.block5.atyourservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.atyourservice.block5.Atyourservice.R

class Splash_Screen : AppCompatActivity() {

    private val SPLASHTIME: Long = 3000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed( {
            startActivity(Intent (this,MainActivity::class.java))
            finish()

        }, SPLASHTIME)
    }
}