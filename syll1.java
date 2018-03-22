package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class syll1 extends AppCompatActivity {

Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syll);
        toolbar=(Toolbar)findViewById(R.id.toolbar);


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
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://studentboxoffice.in/jntuh/syllabus/quick-links/68"));
        startActivity(browserIntent);
    }
    public void s4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://studentboxoffice.in/jntuh/syllabus/quick-links/9"));
        startActivity(browserIntent);
    }
    public void s5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://studentboxoffice.in/jntuh/syllabus/quick-links/74"));
        startActivity(browserIntent);
    }
    public void s6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://skyupsmedia.blogspot.in/2015/12/jntuh-r13-3-2-ece-syllabus-copy.html"));
        startActivity(browserIntent);
    }
    public void s7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://studentboxoffice.in/jntuh/syllabus/quick-links/81"));
        startActivity(browserIntent);
    }
    public void s8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.smartzworld.com/downloads/download/jntuh-r-09-cse-syllabus-book-4-2/"));
        startActivity(browserIntent);
    }
}
