package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class attd3 extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attd3);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Attendance");
    }
    public void b1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B3LFVaoM8zAGbW1PaUtySjdSRHdkd2FEcFRmclZ4NXJIRlVn/view"));
        startActivity(browserIntent);
    }
    public void b2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1sjPDOdhMj4y4YxbRP4dyVqlhY5fxc3KdCMwV7pDcNi4/edit#gid=1814042653"));
        startActivity(browserIntent);
    }
    public void b3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1sjPDOdhMj4y4YxbRP4dyVqlhY5fxc3KdCMwV7pDcNi4/edit#gid=1814042653"));
        startActivity(browserIntent);
    }
    public void b4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1sjPDOdhMj4y4YxbRP4dyVqlhY5fxc3KdCMwV7pDcNi4/edit#gid=1814042653"));
        startActivity(browserIntent);
    }
}
