package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quizup.newClass.Question
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        firstCategory.text = "Anime"
        secondCategory.text = "Harry Potter"
        thirdCategory.text = "Heavy Metal"

        var userName = intent.getStringExtra("userName") as String
        Log.d("userName", userName)

        var category1 = intent.getSerializableExtra("Category1") as ArrayList<Question>
        var category2 = intent.getSerializableExtra("Category2") as ArrayList<Question>
        var category3 = intent.getSerializableExtra("Category3") as ArrayList<Question>

        firstCategory.setOnClickListener {
            var intent = Intent(this, GameActivity::class.java).putExtra("questions", category1).putExtra("userName",userName)
            startActivity(intent)
        }

        secondCategory.setOnClickListener {
            var intent = Intent(this, GameActivity::class.java).putExtra("questions", category2).putExtra("userName", userName)
            startActivity(intent)
        }

        thirdCategory.setOnClickListener {
            var intent = Intent(this, GameActivity::class.java).putExtra("questions", category3).putExtra("userName",userName)
            startActivity(intent)
        }


    }
}
