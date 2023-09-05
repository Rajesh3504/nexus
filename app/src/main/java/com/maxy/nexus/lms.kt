package com.maxy.nexus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class lms : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lms)

        webView=findViewById(R.id.erp)
        webView.webViewClient= WebViewClient()
        //webView.loadUrl("https://newerp.kluniversity.in/index.php")

        webView.loadUrl("https://lms.kluniversity.in/login/index.php")
        // webView.loadUrl("https://newerp.kluniversity.in/index.php")
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
}