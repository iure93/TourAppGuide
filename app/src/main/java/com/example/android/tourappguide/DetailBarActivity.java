package com.example.android.tourappguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailBarActivity extends AppCompatActivity {

    int position;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
/*
            TextView name = findViewById(R.id.detail_name);

            final ArrayList<Item> itemArray = BarActivity.items;

            position = getIntent().getIntExtra("position", 0);
            String nameOfAttraction = itemArray.get(position).getNameOfAttraction();
            name.setText(nameOfAttraction);*/
        }
    }

