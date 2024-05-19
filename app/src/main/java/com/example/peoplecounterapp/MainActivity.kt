package com.example.peoplecounterapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider


private lateinit var viewmodel: MainViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewmodel = ViewModelProvider(this)[MainViewModel::class.java]



        val button = findViewById<AppCompatButton>(R.id.myButton)
        val textView = findViewById<TextView>(R.id.textView)
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)

        if (viewmodel.count != 0){
            textView.text = viewmodel.count.toString()
        }

        button.setOnClickListener {
            counter(textView)
        }

        layout.setOnClickListener {
            counter(textView)
        }

    }
}

private fun counter(textView: TextView){
    viewmodel.increment()
    textView.text = viewmodel.count.toString()

}