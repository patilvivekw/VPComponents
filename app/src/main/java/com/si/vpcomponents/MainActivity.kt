package com.si.vpcomponents

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.buttonView)
        btn.setOnClickListener {
            // use of BlinkEffect from VPComponents library
            BlinkEffect.blink(btn)
        }
    }
}