package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.time.Instant

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a = intent
        var q = a.getStringExtra("txt1")

        textView2.setText(q.toString())

        button2.setOnClickListener {
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
        }
    }
}