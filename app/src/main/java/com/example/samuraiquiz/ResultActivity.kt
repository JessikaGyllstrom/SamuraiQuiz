package com.example.samuraiquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        mScore.text = "Your score is: $correctAnswers out of $totalQuestions"

        when (correctAnswers) {
            0, 1, 2, 4, 5 ->  tv_ranking.text = "Congratulations! \n You qualify as an Outcast! \n A low class in feudal Japan"
            6, 7, 8, 9, 10 -> tv_ranking.text = "Congratulations! \n You qualify as a Peasant! \n A middle class in feudal Japan"
            11, 12, 13, 14, 15 ->  tv_ranking.text = "Congratulations! \n You qualify as a Samurai! \n A high class in feudal Japan"
            16, 17, 18, 19, 20  -> tv_ranking.text = "Congratulations! \n You qualify as a Shogun! \n A powerfull lord in feudal Japan"
        }



        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}


