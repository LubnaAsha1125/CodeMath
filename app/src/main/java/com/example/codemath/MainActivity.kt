package com.example.codemath

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eWeight = findViewById<EditText>(R.id.elev_weight);
        var iWeight = findViewById<EditText>(R.id.item_weight);
        var item = findViewById<EditText>(R.id.item_name);
        var button = findViewById<Button>(R.id.button);
        var calc = findViewById<TextView>(R.id.Calculation);

        button.setOnClickListener {
            val int1 = Integer.parseInt(eWeight.text.toString())
            val int2 = Integer.parseInt(iWeight.text.toString())
            val result = int1 / int2

            if (result < 1){
                calc.setText("You can't fit any " + item.text + " in the elevator ☹️")
            }
            if (result == 1){
                calc.setText("You can fit " + result + " " + item.text +" in the elevator. 🙂")
            }
            else{
                calc.setText("You can fit " + result + " " + item.text + "s in the elevator! 😄")
            }
        }
    }
}








