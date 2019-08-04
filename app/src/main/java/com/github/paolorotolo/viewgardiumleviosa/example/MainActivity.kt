package com.github.paolorotolo.viewgardiumleviosa.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.paolorotolo.viewgardiumleviosa.startFluctuate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        answerButton.startFluctuate(-50, 500)
    }
}
