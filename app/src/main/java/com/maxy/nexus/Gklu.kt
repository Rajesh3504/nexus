package com.maxy.nexus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
class Gklu : AppCompatActivity() {

    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gklu)

        webView=findViewById(R.id.gklu)
        webView.webViewClient= WebViewClient()

        webView.loadUrl("https://www.kluniversity.in/")

    }

    override fun onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }
}