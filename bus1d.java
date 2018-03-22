package com.example.gayat.gnits;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class bus1d extends AppCompatActivity {
    Toolbar mtoolbar;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus1d);
        mtoolbar=(Toolbar)findViewById(R.id.toolbar1);
        img1=(ImageView)findViewById(R.id.imageView3);
        Intent i=getIntent();
        String busno=i.getStringExtra("br");
        Log.i("log",busno);
        if(busno==null)
        {
            Toast.makeText(this, "No data available ", Toast.LENGTH_SHORT).show();
            return;
        }
        mtoolbar.setTitle(busno);
        switch (busno){
            case "BUSROUTE NO.1D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b1d));
                break;
            }
            case "BUSROUTE NO.2D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b2d));
                break;
            }
            case "BUSROUTE NO.3D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b3d));
                break;
            }
            case "BUSROUTE NO.4D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b4d));
                break;
            }
            case "BUSROUTE NO.5D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b5d));
                break;
            }
            case "BUSROUTE NO.6D":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b6d));
                break;
            }
            case "BUSROUTE NO.10E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b10e));
                break;
            }
            case "BUSROUTE NO.11E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b11e));
                break;
            }
            case "BUSROUTE NO.12E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b12e));
                break;
            }
            case "BUSROUTE NO.13E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b13e));
                break;
            }
            case "BUSROUTE NO.14E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b14e));
                break;
            }
            case "BUSROUTE NO.15E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b15e));
                break;
            }
            case "BUSROUTE NO.16E":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b16e));
                break;
            }
            case "BUSROUTE NO.20K":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b20k));
                break;
            }
            case "BUSROUTE NO.21K":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b21k));
                break;
            }
            case "BUSROUTE NO.22K":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b22k));
                break;
            }
            case "BUSROUTE NO.23K":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b23k));
                break;
            }
            case "BUSROUTE NO.27P":
            {
                img1.setImageDrawable(ContextCompat.getDrawable(bus1d.this,R.drawable.b27p));
                break;
            }



        }

        }
       }

