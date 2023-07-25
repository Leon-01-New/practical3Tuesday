package com.example.practical3tuesday

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       setClickListener()

        }

    private fun makecoloured(view : View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_three_test -> view.setBackgroundColor(Color.RED)
            R.id.box_four_test -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_test -> view.setBackgroundColor(Color.YELLOW)
            R.id.red_button -> findViewById<TextView>(R.id.box_three_test).setBackgroundResource(R.color.my_red)
            R.id.yellow_button ->  findViewById<TextView>(R.id.box_four_test).setBackgroundResource(R.color.my_yellow)
            R.id.green_button ->  findViewById<TextView>(R.id.box_five_test).setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.BLACK)
        }

    }

    private fun setClickListener(){
        val boxonetext = findViewById<TextView>(R.id.box_one_text)
        val boxtwotext = findViewById<TextView>(R.id.box_two_text)
        val boxthreetext = findViewById<TextView>(R.id.box_three_test)
        val boxfourtext = findViewById<TextView>(R.id.box_four_test)
        val boxfivetext = findViewById<TextView>(R.id.box_five_test)
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val rootContraintLayout = findViewById<View>(R.id.contraint_layout)

            val clickableViews: List<View> =
                listOf(boxonetext, boxtwotext, boxthreetext,
                    boxfourtext, boxfivetext, rootContraintLayout,redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener { makecoloured(it) }
        }



    }


}

