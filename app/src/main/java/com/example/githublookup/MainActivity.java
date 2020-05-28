package com.example.githublookup;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBar;

    @SuppressLint("SetJavaScriptEnabled")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        webView =  findViewById( R.id.webview );
        progressBar = findViewById( R.id.progressBar );
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled( true );
        //Opening links in the App
        webView.setWebViewClient( new WebViewClient() );
        webView.loadUrl( "https://andrew-1000.github.io/github-search/" );
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
