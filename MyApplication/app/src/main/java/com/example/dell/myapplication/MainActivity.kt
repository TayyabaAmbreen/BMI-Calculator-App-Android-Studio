package com.example.dell.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById(R.id.button) as Button
        btn.setOnClickListener {
        //    Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val weight = findViewById(R.id.editText3) as TextView
            val height = findViewById(R.id.editText2) as TextView
            var w: Float = weight.text.toString().toFloat()
            var h: Float = height.text.toString().toFloat()

            var t: Float=(w/h)/h
             //System.out.print(t);
          //  Toast.makeText(this@MainActivity, t, Toast.LENGTH_SHORT).show()
            val bmi = findViewById(R.id.textView3) as TextView
            var s: String = t.toString()
           bmi.setText(s)
           // bmi.text=t.toString()
     //       Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}
