package com.example.gayat.gnits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class contacts extends AppCompatActivity {
    int[] IMAGES={R.drawable.princi,R.drawable.csehod,R.drawable.ecehod,
            R.drawable.it,R.drawable.eeehod,R.drawable.etmhod,R.drawable.hmhod,R.drawable.tpo};
    String[] NAMES={"Dr.K.Ramesh Reddy,Principal","Dr.M.Seetha,CSE-HOD","Dr.B.Venkateshulu,ECE-HOD",
            "Dr.I.Raviprakash Reddy,IT-HOD","Dr.N.Malla Reddy,EEE-HOD","Dr.K.RamaLinga Reddy,ETM-HOD",
    "Dr.P.Aparna,H&M-HOD","G.Narendrababu Reddy,I/C TPO"};
    String[] DESCRIPTIONS={"PH.NO:040-23565648","PH.NO:040-23565648 EXTN-305","PH.NO:040-23565648 EXTN-404",
            "PH.NO:040-23565648 EXTN-330","PH.NO:040-23565648 EXTN-202","PH.NO:040-23565648 EXTN-117",
            "PH.NO:040-23565648 EXTN-142","PH.NO:040-23565648 EXTN-211"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return view;
        }
    }
}
