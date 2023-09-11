package com.example.mad_practical7_21012011118

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.videoViewId)
        val btn: FloatingActionButton = findViewById(R.id.button)

        btn.setOnClickListener {
            
        }
    }
}