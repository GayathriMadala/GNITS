package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class syll5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syll5);

    }
    public void s1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://jntuh.ac.in//bulletin_board/B.Tech._I_Sem._Sylla1470115554.pdf"));
        startActivity(browserIntent);
    }
    public void s2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://jntuh.ac.in//bulletin_board/B_Tech_II_Sem_Syllabus_of_CSE_ECE_EEE_etc_R16.pdf"));
        startActivity(browserIntent);
    }
    public void s3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }
    public void s4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }
    public void s5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }
    public void s6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }
    public void s7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }
    public void s8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in/?q=etmsyl"));
        startActivity(browserIntent);
    }}