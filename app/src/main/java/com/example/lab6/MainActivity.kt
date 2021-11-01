package com.example.lab6

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.lab6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bdayMessage(view: android.view.View) {
        val dateText = findViewById<TextView>(R.id.textMessage)
        val editdate = findViewById<EditText>(R.id.editTextDate)
        val text = editdate.text
        dateText.text = "Happy Birthday on " + text + "!"

        val addImage = findViewById<ImageView>(R.id.imageView)
        addImage.setImageResource(R.drawable.birthday_party)

    }
}
