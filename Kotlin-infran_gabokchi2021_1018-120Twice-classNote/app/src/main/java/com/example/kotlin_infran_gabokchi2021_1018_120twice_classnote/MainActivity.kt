package com.example.kotlin_infran_gabokchi2021_1018_120twice_classnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//🍀150 4:25 . val, setOnClickListener, Intent
        
        val btn1 = findViewById<ImageView>(R.id.member1)
        val btn2 = findViewById<ImageView>(R.id.member2)
        val btn3 = findViewById<ImageView>(R.id.member3)
        val btn4 = findViewById<ImageView>(R.id.member4)
        val btn5 = findViewById<ImageView>(R.id.member5)
        val btn6 = findViewById<ImageView>(R.id.member6)
        val btn7 = findViewById<ImageView>(R.id.member7)
        val btn8 = findViewById<ImageView>(R.id.member8)
        val btn9 = findViewById<ImageView>(R.id.member9)

//        🍀150 4:25, src-id-click , click하면 ImageInsideActivity로 넘어감
//       🍀150 8:50 , mainActivity 에서 설정한 data 정보를 ,
                    //ImageInsdeActivty로 보내고
                    //그 정보와 같은 사진을 보여줌
//        ~~.putExtra(name,value)

        btn1.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)

//🍀150 8:50
            intent.putExtra("data", "1")
            startActivity(intent)

        }


        btn2.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)

        }

        btn3.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)

        }

        btn4.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)

        }

        btn5.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)

        }

        btn6.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)

        }

        btn7.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)

        }

        btn8.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)

        }

        btn9.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)

        }


    }
}