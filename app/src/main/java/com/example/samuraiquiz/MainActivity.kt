package com.example.samuraiquiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* mediaPlayer = MediaPlayer.create(applicationContext, R.raw.taiko)
        mediaPlayer.start()
        mediaPlayer.setLooping(true)*/

        findViewById<Button>(R.id.btn_start).setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()
            mediaPlayer.stop()
        }



        }

        }

