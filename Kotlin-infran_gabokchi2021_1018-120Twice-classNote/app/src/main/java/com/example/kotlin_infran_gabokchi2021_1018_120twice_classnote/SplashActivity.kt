package com.example.kotlin_infran_gabokchi2021_1018_120twice_classnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


//        🍀120
//            Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        }, 3000)

//        🍀130 트와이스 사진 삽입 - LinearLayout Weight, windowNoTitleBar

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)
    }
}