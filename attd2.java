package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class attd2 extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attd2);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Attendance");
    }
    public void b1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B3LFVaoM8zAGbW1PaUtySjdSRHdkd2FEcFRmclZ4NXJIRlVn/view"));
        startActivity(browserIntent);
    }
    public void b2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B3LFVaoM8zAGdnYzS1lPQ0FwN0paYU80U3F6UUxoR3lxOXVF/view"));
        startActivity(browserIntent);
    }
    public void b3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B3LFVaoM8zAGcEpOT2ZId1EybVZiS281UE9ueXFWaFN1X0hv/view"));
        startActivity(browserIntent);
    }
    public void b4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B3LFVaoM8zAGN2FBTDhrX2FTVEZXdS1hWi05b0F3aldWR3JZ/view"));
        startActivity(browserIntent);
    }
}
