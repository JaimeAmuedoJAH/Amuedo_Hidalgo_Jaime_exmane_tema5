package com.jah.amuedo_hidalgo_jaime_exmane_tema5;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VerWebView extends AppCompatActivity {

    WebView wvPagina;
    Button btnVolver;
    Intent data;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_web_view);
        initComponents();

        btnVolver.setOnClickListener(view -> finish());
        verWeb();
    }

    private void verWeb() {
        wvPagina.setWebViewClient(new WebViewClient());
        wvPagina.loadUrl(url);
    }

    private void initComponents() {
        wvPagina = findViewById(R.id.wvPagina);
        btnVolver = findViewById(R.id.btnVolver);
        data = getIntent();
        url = data.getStringExtra("url");
    }
}