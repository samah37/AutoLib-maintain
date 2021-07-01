package com.clovertech.autolib.views.activities


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.clovertech.autolib.R


class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT :Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            // Start your app main activity
            val intent = Intent(this@SplashScreen, OnBoardingActivity::class.java)
            startActivity(intent)
            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
