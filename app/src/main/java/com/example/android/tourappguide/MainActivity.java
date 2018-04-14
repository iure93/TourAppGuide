package com.example.android.tourappguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView monuments = findViewById(R.id.monuments);
        // Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);
                //start new activity
                startActivity(monumentsIntent);
            }
        });

        ImageView bar = findViewById(R.id.bar);
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar = new Intent(MainActivity.this, BarActivity.class);
                startActivity(bar);
            }
        });

        ImageView restaurant = findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurant = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurant);
            }
        });

        ImageView service = findViewById(R.id.service);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent service = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(service);
            }
        });




    }


}
