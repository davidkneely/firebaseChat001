package com.visionrunner.firebasechat001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creates reference to the TextView in the resXML file
        val textView2 = findViewById<TextView>(R.id.textView2)
        textView2.text = "Hello World!"

        // Sets variable for the reference to the TextView in the XML file
        val editText = findViewById<EditText>(R.id.editText2)
        editText.setText("Hi")

        val button = findViewById<Button>(R.id.button)
        button.setText("Submit")
        button.setOnClickListener {
            textView2.setText(editText.text)
            println("You pressed the button")
        }
    }
}
