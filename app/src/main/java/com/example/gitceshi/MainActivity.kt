package com.example.gitceshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var value: Int? = 0
    val value2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("ajdfjaljflkajsfl")
        value = 10
        value = 20
    }
}
