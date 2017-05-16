package com.example.jhonny.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        String link = getIntent().getStringExtra("link");

        webView = (WebView)findViewById(R.id.web);
        webView.loadUrl(link);

    }

    @Override
    public void onClick(View v) {

    }
}
