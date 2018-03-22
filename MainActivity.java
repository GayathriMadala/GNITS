package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewSwitcher;


public class  MainActivity extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    ImageButton image1;
    ImageButton image2;
    ImageButton image3;
    ImageButton image4;
    ImageButton image5;
    ImageButton image6;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final int images[]=new int[]{R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic1};
        imageSwitcher= (ImageSwitcher)findViewById(R.id.switcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(MainActivity.this);
                myView.setScaleType(ImageView.ScaleType.FIT_XY);
                myView.setLayoutParams(new
                        ImageSwitcher.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });
        imageSwitcher.postDelayed(new Runnable()
        {

            @Override
            public void run() {
                imageSwitcher.setImageResource(images[i]);
                if(i==images.length-1){
                    i=0;
                }else
                    i++;

                imageSwitcher.postDelayed(this,3000);
            }
        },10);
        image1=(ImageButton)findViewById(R.id.imageButton4);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,aboutus.class);
                startActivity(i1);
            }
        });
        image2=(ImageButton)findViewById(R.id.imageButton5);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,bus.class);
                startActivity(i2);
            }
        });
        image3=(ImageButton)findViewById(R.id.imageButton6);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(MainActivity.this,depts.class);
                startActivity(i3);
            }
        });

        image4=(ImageButton)findViewById(R.id.imageButton7);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(MainActivity.this,contacts.class);
                startActivity(i4);
            }
        });






        image6=(ImageButton)findViewById(R.id.imageButton9);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(MainActivity.this,sports.class);
                startActivity(i6);
            }
        });




    }
    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in"));
        startActivity(browserIntent);
    }
}
