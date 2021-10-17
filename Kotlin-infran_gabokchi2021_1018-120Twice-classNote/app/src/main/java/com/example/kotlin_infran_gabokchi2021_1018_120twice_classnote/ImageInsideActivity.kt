package com.example.kotlin_infran_gabokchi2021_1018_120twice_classnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)


//        🍀150 8:50, (보내온 변수 이름~~).getStringExtra() : 보내온 데이터를 받음.
//         Toast.makeText()
        val getData = intent.getStringExtra("data")

//        🍀150 16:00
//        MainActivity.kt에서 보낸 data, value=1일때
//        activity_image_inside.xml의 src=member_1로 설정함 
//        (MainActivity.kt에서 보낸 data, value=2일때
//        activity_image_inside.xml의 src=member_2로 설정함)


        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        // Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if(getData == "1"){
            memberImage.setImageResource(R.drawable.member_1)
        }

        if(getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        }

        if(getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        }

        if(getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        }

        if(getData == "5") {
            memberImage.setImageResource(R.drawable.member_5)
        }

        if(getData == "6") {
            memberImage.setImageResource(R.drawable.member_6)
        }

        if(getData == "7") {
            memberImage.setImageResource(R.drawable.member_7)
        }

        if(getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        }

        if(getData == "9") {
            memberImage.setImageResource(R.drawable.member_9)
        }



    }
}