package com.example.quizup

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.graphics.green
import com.example.quizup.newClass.Question
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var userName = intent.getStringExtra("userName") as String
        Log.d("userName", userName)

        var questions = intent.getSerializableExtra("questions") as ArrayList<Question>



        var cnt: Int = 1
        val size: Int = questions.size
        var score: Int = 0
        var access = false
        var checker: String = ""


        questionBody.text =  questions[0].body
        a.text = questions[0].answers[0]
        b.text = questions[0].answers[1]
        c.text = questions[0].answers[2]
        d.text = questions[0].answers[3]

        if (questions[0].rightAnswerIndex == 0){
            a.setOnClickListener {
                if(checker == "") {
                    access = true
                    score = score + 1
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    a.setBackgroundColor(Color.GREEN)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            b.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    b.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            c.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    c.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            d.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    d.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }

        }

        if (questions[0].rightAnswerIndex == 1){
            a.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    a.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            b.setOnClickListener {
                if(checker == "") {
                    access = true
                    score = score + 1
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    b.setBackgroundColor(Color.GREEN)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            c.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    c.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            d.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    d.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }

        }

        if (questions[0].rightAnswerIndex == 2){
            a.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    a.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            b.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    b.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            c.setOnClickListener {
                if(checker == "") {
                    access = true
                    score = score + 1
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    c.setBackgroundColor(Color.GREEN)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            d.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    d.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }

        }

        if (questions[0].rightAnswerIndex == 3){
            a.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    a.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            b.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    b.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            c.setOnClickListener {
                if(checker == "") {
                    access = true
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    c.setBackgroundColor(Color.RED)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }
            d.setOnClickListener {
                if(checker == "") {
                    access = true
                    score = score + 1
                    textView3.text = score.toString() + "/" + cnt.toString()
                    checker = "on"
                    d.setBackgroundColor(Color.GREEN)
                }
                if(checker == "on"){
                    Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                }
            }

        }





        next.setOnClickListener {
            checker = ""
            a.setBackgroundColor(Color.LTGRAY)
            b.setBackgroundColor(Color.LTGRAY)
            c.setBackgroundColor(Color.LTGRAY)
            d.setBackgroundColor(Color.LTGRAY)
        if(access == true) {


            if (cnt >= size) {

                var intent = Intent(this, ResultActivity::class.java).putExtra("userName", userName).putExtra("score", score.toString()).putExtra("size", size.toString())
                startActivity(intent)

            }
            if (cnt < size) {

                access = false

                questionBody.text = questions[cnt].body
                a.text = questions[cnt].answers[0]
                b.text = questions[cnt].answers[1]
                c.text = questions[cnt].answers[2]
                d.text = questions[cnt].answers[3]



                if (questions[cnt].rightAnswerIndex == 0){
                    a.setOnClickListener {
                        if(checker == "") {
                            access = true
                            score = score + 1
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            a.setBackgroundColor(Color.GREEN)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    b.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            b.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    c.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            c.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    d.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            d.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }

                }

                if (questions[cnt].rightAnswerIndex == 1){
                    a.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            a.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    b.setOnClickListener {
                        if(checker == "") {
                            access = true
                            score = score + 1
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            b.setBackgroundColor(Color.GREEN)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    c.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            c.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    d.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            d.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }

                }

                if (questions[cnt].rightAnswerIndex == 2){
                    a.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            a.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    b.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            b.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    c.setOnClickListener {
                        if(checker == "") {
                            access = true
                            score = score + 1
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            c.setBackgroundColor(Color.GREEN)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    d.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            d.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }

                }

                if (questions[cnt].rightAnswerIndex == 3){
                    a.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            a.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    b.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            b.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    c.setOnClickListener {
                        if(checker == "") {
                            access = true
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            c.setBackgroundColor(Color.RED)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }
                    d.setOnClickListener {
                        if(checker == "") {
                            access = true
                            score = score + 1
                            textView3.text = score.toString() + "/" + cnt.toString()
                            checker = "on"
                            d.setBackgroundColor(Color.GREEN)
                        }
                        if(checker == "on"){
                            Toast.makeText(this, "You've already chose your answer", Toast.LENGTH_LONG).show()
                        }
                    }

                }








                cnt = cnt + 1
            }
        }

            else {
            Toast.makeText(this, "Please, choose the answer", Toast.LENGTH_LONG).show()
            }
        }

    }
}
