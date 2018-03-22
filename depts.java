package com.example.gayat.gnits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class depts extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(depts.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.deptnames));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i2 = new Intent(depts.this, cse.class);
                i2.putExtra("deptname", listView.getItemAtPosition(i).toString());
                startActivity(i2);
            }

        });
        listView.setAdapter(mAdapter);
    }
}

