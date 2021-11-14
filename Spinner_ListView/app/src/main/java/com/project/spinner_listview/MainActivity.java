package com.project.spinner_listview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spnDog;
    ImageView img1;
    ListView lstCat;

    int[] dogIds = new int[]{R.drawable.dog1,R.drawable.dog2,R.drawable.dog3,
            R.drawable.dog4,R.drawable.dog5,R.drawable.dog6};

    int[] catIds = new int[]{R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,
            R.drawable.cat4,R.drawable.cat5,R.drawable.cat6};

    String[] data =new String[]{"dog1","dog2","dog3","dog4","dog5","dog6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Spinner_ListView");

        textView = (TextView)findViewById(R.id.textView);
        spnDog = (Spinner)findViewById(R.id.spnDog);
        img1 = (ImageView)findViewById(R.id.img1);
        lstCat = (ListView)findViewById(R.id.lstCat);

        lstCat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText("貓 " + String.valueOf(position + 1));
                img1.setImageResource(catIds[position]);
            }
        });

        spnDog.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(String.valueOf(position + 1) + ", " + parent.getSelectedItem().toString() );
                img1.setImageResource(dogIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
