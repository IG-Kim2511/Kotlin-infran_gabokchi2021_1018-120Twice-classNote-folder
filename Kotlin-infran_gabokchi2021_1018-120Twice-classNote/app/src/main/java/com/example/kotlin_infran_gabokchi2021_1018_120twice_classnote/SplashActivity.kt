package com.example.kotlin_infran_gabokchi2021_1018_120twice_classnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


//        π120
//            Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        }, 3000)

//        π130 νΈμμ΄μ€ μ¬μ§ μ½μ - LinearLayout Weight, windowNoTitleBar

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)
    }
}