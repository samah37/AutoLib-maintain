package com.clovertech.autolib.views.activities


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.clovertech.autolib.R
import com.clovertech.autolib.utils.PrefUtils
import kotlinx.android.synthetic.main.fragment_theme.*


class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT :Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        /*if (PrefUtils.with(this).getString(PrefUtils.Keys.DARK_MODE,"")=="dark"){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            if(PrefUtils.with(this).getString(PrefUtils.Keys.DARK_MODE,"")=="light"){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
            }
        }*/

        Handler(Looper.getMainLooper()).postDelayed({
            // Start your app main activity
            val intent = Intent(this@SplashScreen, OnBoardingActivity::class.java)
            startActivity(intent)
            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
