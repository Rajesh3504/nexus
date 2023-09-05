package com.maxy.nexus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class beingzero : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beingzero)

        webView=findViewById(R.id.beingzero)
        webView.webViewClient= WebViewClient()
        webView.loadUrl("https://www.google.in")

        //webView.loadUrl("https://lms.kluniversity.in/login/index.php")
        //webView.loadUrl("https://newerp.kluniversity.in/index.php")
        //https://newerp.kluniversity.in/

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
 //
}