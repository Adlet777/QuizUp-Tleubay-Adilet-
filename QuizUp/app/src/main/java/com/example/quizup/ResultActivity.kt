package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var userName = intent.getStringExtra("userName") as String
        Log.d("userName", userName)

        var score = intent.getStringExtra("score") as String
        Log.d("score", score)

        var size = intent.getStringExtra("size") as String
        Log.d("size", size)

        name.text = userName

        resultat.text = score + "/" + size

        backToCategories.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
