package com.example.quizup.newClass

import java.io.Serializable

class Question (
    var body: String,
    var answers: ArrayList<String>,
    var rightAnswerIndex: Int
):Serializable

class Category(
    var title: String,
    var questions: ArrayList<Question>
)