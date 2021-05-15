package com.example.webvista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class actiweb extends AppCompatActivity {
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actiweb);
    w1=findViewById(R.id.we);
    String URL= getIntent().getStringExtra("SitioWeb");
    w1.setWebViewClient(new WebViewClient());
    w1.loadUrl("http://"+URL);

    }

    public void cerrar(View view) {
        finish();
    }
}