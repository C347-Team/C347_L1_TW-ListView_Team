package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> module;
    ArrayAdapter<Module> aa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        module = new ArrayList<Module>();

        if (year.equals("Year 1")) {
            module.add(new Module("C105", R.drawable.prog));
            module.add(new Module("C108", R.drawable.prog));
            module.add(new Module("G952", R.drawable.nonprog));
        } else if (year.equals("Year 2")) {
            module.add(new Module("C308", R.drawable.prog));
            module.add(new Module("C346", R.drawable.prog));
            module.add(new Module("G953", R.drawable.nonprog));
        } else {
            module.add(new Module("C349", R.drawable.prog));
            module.add(new Module("C347", R.drawable.prog));
            module.add(new Module("C390", R.drawable.nonprog));
        }

        lv = findViewById(R.id.lvModule);

        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);

    }



}
