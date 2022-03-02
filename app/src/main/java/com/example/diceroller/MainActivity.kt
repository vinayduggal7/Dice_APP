package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener{ Roll() }

     //   val coutnupbutton : Button = findViewById(R.id.count_up)
      //  count

}

    private fun Roll(){
        //Toast.makeText(this, "clicked" ,Toast.LENGTH_SHORT).show()
        val randomint = (1..6).random()

        val rolltext: ImageView = findViewById(R.id.image1)

        val drawableResource = when(randomint){
            1 ->  R.drawable.dice_1
            2 ->    R.drawable.dice_2
            3 ->   R.drawable.dice_3
            4 ->    R.drawable.dice_4
            5 ->     R.drawable.dice_5
            else ->   R.drawable.dice_6
        }

        rolltext.setImageResource(drawableResource)
    }
}