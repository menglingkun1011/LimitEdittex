package com.example.mlk.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri=Uri.parse("app://");
//                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                startActivity(intent);
//            }
//        });
//        web = (WebView) findViewById(R.id.webview);
//        web.loadUrl("file:///android_asset/H5.html");


    }
}
