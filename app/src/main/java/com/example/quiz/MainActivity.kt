package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""

        rdg.setOnCheckedChangeListener { group, i ->
            if (radioButton3.isChecked) {
                a = "ถูกต้อง"
            }
            else {
                a = "ไม่ถูกต้อง"

            }

        }
        button.setOnClickListener {
            if (a == "" )
            {Toast.makeText(this@MainActivity, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val  i = Intent(this,MainActivity2::class.java)
            i.putExtra("txt1",a.toString())
            startActivity(i)
        }


    }
}