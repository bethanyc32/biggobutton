package edu.uw.ischool.bchum003.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var numOfPushes = 0

    fun pushButton(view: View) {
        numOfPushes++
        val tempButton: Button = findViewById(R.id.button)
        tempButton.text = "You have pushed me $numOfPushes times!"
    }
}