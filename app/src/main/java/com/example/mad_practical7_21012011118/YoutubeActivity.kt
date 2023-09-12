package com.example.mad_practical7_21012011118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    lateinit var youtubeWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        youtubeWebView= findViewById(R.id.webViewId)
        val btn: FloatingActionButton = findViewById(R.id.button)

        initYoutubePlayer()

        btn.setOnClickListener {
            Intent(this@YoutubeActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private val youtubeId = "fJn9B64Znrk"
    fun initYoutubePlayer()
    {
        val webSettings: WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}