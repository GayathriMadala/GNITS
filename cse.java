package com.example.gayat.gnits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class cse extends AppCompatActivity {
    Toolbar mtoolbar;
    ImageButton img1;
    ImageButton img2;
    ImageButton img3;
    ImageButton img4;
    ImageButton img5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar3);
        Intent i = getIntent();
        String dn = i.getStringExtra("deptname");
        Log.i("log", dn);
        if (dn == null) {
            Toast.makeText(this, "No data available ", Toast.LENGTH_SHORT).show();
            return;
        }
        mtoolbar.setTitle(dn);
        switch (dn) {
            case "Computer Science and Engineering": {
                img1 = (ImageButton) findViewById(R.id.ib1);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(cse.this, mission1.class);
                        startActivity(i1);
                    }
                });
                img2 = (ImageButton) findViewById(R.id.ib2);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(cse.this, syll1.class);
                        startActivity(i2);
                    }
                });
                img3 = (ImageButton) findViewById(R.id.ib3);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i3 = new Intent(cse.this, attd1.class);
                        startActivity(i3);
                    }
                });

                img4 = (ImageButton) findViewById(R.id.ib4);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i4 = new Intent(cse.this, club1.class);
                        startActivity(i4);
                    }
                });
                break;
            }
            case "Electronics and Communication Engineering": {
                img1 = (ImageButton) findViewById(R.id.ib1);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(cse.this, mission2.class);
                        startActivity(i1);
                    }
                });
                img2 = (ImageButton) findViewById(R.id.ib2);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(cse.this, syll2.class);
                        startActivity(i2);
                    }
                });
                img3 = (ImageButton) findViewById(R.id.ib3);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i3 = new Intent(cse.this, attd2.class);
                        startActivity(i3);
                    }
                });
                img4 = (ImageButton) findViewById(R.id.ib4);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i4 = new Intent(cse.this, club2.class);
                        startActivity(i4);
                    }
                });
                break;
            }
            case "Electrical and Electronics Engineering": {
                img1 = (ImageButton) findViewById(R.id.ib1);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(cse.this, mission3.class);
                        startActivity(i1);
                    }
                });
                img2 = (ImageButton) findViewById(R.id.ib2);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(cse.this, syll3.class);
                        startActivity(i2);
                    }
                });
                img3 = (ImageButton) findViewById(R.id.ib3);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i3 = new Intent(cse.this, attd3.class);
                        startActivity(i3);
                    }
                });
                img4 = (ImageButton) findViewById(R.id.ib4);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i4 = new Intent(cse.this, club3.class);
                        startActivity(i4);
                    }
                });
                break;
            }
            case "Information Technology": {
                img1 = (ImageButton) findViewById(R.id.ib1);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(cse.this, mission4.class);
                        startActivity(i1);
                    }
                });
                img2 = (ImageButton) findViewById(R.id.ib2);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(cse.this, syll4.class);
                        startActivity(i2);
                    }
                });
                img3 = (ImageButton) findViewById(R.id.ib3);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i3 = new Intent(cse.this, attd4.class);
                        startActivity(i3);
                    }
                });
                img4 = (ImageButton) findViewById(R.id.ib4);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i4 = new Intent(cse.this, club4.class);
                        startActivity(i4);
                    }
                });
                break;
            }
            case "Electronics and Telematics Engineering": {
                img1 = (ImageButton) findViewById(R.id.ib1);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(cse.this, mission5.class);
                        startActivity(i1);
                    }
                });
                img2 = (ImageButton) findViewById(R.id.ib2);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(cse.this, syll5.class);
                        startActivity(i2);
                    }
                });
                img3 = (ImageButton) findViewById(R.id.ib3);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i3 = new Intent(cse.this, attd5.class);
                        startActivity(i3);
                    }
                });
                img4 = (ImageButton) findViewById(R.id.ib4);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i4 = new Intent(cse.this, club5.class);
                        startActivity(i4);
                    }
                });
                break;
            }



        }
    }
    public void b1(View view){



        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gnits.ac.in"));
        startActivity(browserIntent);
    }

}
