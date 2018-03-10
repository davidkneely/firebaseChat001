package com.visionrunner.firebase001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase



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
            saveToFirebase()
        }
    }

    fun saveToFirebase() {

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")
    }
}
