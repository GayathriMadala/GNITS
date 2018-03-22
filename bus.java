package com.example.gayat.gnits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bus extends AppCompatActivity {
Toolbar toolbar;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        listView=(ListView)findViewById(R.id.listview1);
        ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(bus.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.bu));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent i1=new Intent(bus.this,bus1d.class);
                Log.i("log",listView.getItemAtPosition(i).toString());
                i1.putExtra("br",listView.getItemAtPosition(i).toString());
                startActivity(i1);

            }
        });
listView.setAdapter(mAdapter);

    }
}
