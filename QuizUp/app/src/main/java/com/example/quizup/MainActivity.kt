package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizup.newClass.Category
import com.example.quizup.newClass.Question
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputTextUserName.text

        var question: Question = Question("The plot of which anime takes place in Konoha village?", arrayListOf<String>("Naruto","Death Note","DevilMan: Crybaby", "A Silent Voice"), 0)
        var question2: Question = Question("In which anime Jesus Christ and Buddha are two best friends?", arrayListOf<String>("A Place Further than the Universe","Tsurune: Kazemai","Saint Oniisan", "Your Name"), 2)
        var question3: Question = Question("In which anime you can learn about the story of Jack the Ripper?", arrayListOf<String>("Goblin Slayer","Black Butler","Muhyo & Roji's Bureau of Supernatural Investigation", "JoJo"), 1)

        var category: Category = Category("Anime", arrayListOf<Question>(question,question2,question3) )


        var question4: Question = Question("What was the name of the headmaster of Hogwartz?", arrayListOf<String>("Angus Smumbledore","Albus Dumbledore","Angus Dumbledore", "Dumble Angledoor"), 1)
        var question5: Question = Question("In which house was Harry Potter?", arrayListOf<String>("Griffindor","Slytherin","Hufflepuff", "Ravenclaw"), 0)
        var question6: Question = Question("Which one of Harry's friends is considered to be smart?", arrayListOf<String>("Neville Longbottom","Ron Weasley","Rubeus Hagrid", "Hermione Granger"), 3)
        var question11: Question = Question("Who is the main threat in Harry Potter book series?", arrayListOf<String>("Lord Voldemort","Draco Malfoy","Bellatrix Lestrange", "Severus Snape"), 0)
        var question12: Question = Question("What Patronus does Harry have?", arrayListOf<String>("owl","wolf","stag", "raven"), 2)
        var question13: Question = Question("Who was the Half-Blood Prince?", arrayListOf<String>("Harry Potter","Lord Voldemort","Neville Longbottom", "Severus Snape"), 3)
        var question14: Question = Question("According to me, which one of the houses in Harry Potter is the best one?", arrayListOf<String>("Ravenclaw","Griffindor","Hufflepuff", "Slytherin"), 0)

        var category2: Category = Category("Harry Potter", arrayListOf<Question>(question4,question5,question6, question11, question12, question13, question14))


        var question7: Question = Question("The members of which band are armenians?", arrayListOf<String>("Five Finger Death Punch","System of a down","Suicide Silence", "Three Days Grace"), 1)
        var question8: Question = Question("The members of which band are famous to wear masks?", arrayListOf<String>("Evanescense","Asking Alexandria","Slipknot", "Powerwolf"), 2)
        var question9: Question = Question("The german band that has released a single named 'Mein Herz Brennt'?", arrayListOf<String>("Hollywood Undead","Our Last Night","Delain", "Rammstein"), 3)
        var question10: Question = Question("The band which has release the album named 'Suicide Season'?", arrayListOf<String>("August Burns Red","Bring Me The Horizon","30 Seconds To Mars", "Skillet"), 1)

        var category3: Category = Category("Heavy Metal", arrayListOf<Question>(question7, question8, question9, question10))

        startBtn.setOnClickListener {
            if(inputTextUserName.text!!.isNotEmpty()){
            var intent = Intent(this, CategoryActivity::class.java).putExtra("Category1", category.questions).putExtra("userName", inputTextUserName.text.toString()).putExtra("Category2", category2.questions).putExtra("Category3", category3.questions)
            startActivity(intent)
            }
            else{
                Toast.makeText(this, "Please, enter your name!", Toast.LENGTH_LONG).show()
            }
        }

    }
}
