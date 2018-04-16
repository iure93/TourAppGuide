package com.example.android.tourappguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    public static final ArrayList<Item> items = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        // Create a list of item
        items.add(new Item("Maialotto", R.drawable.gradiscahome));
        items.add(new Item("Caffè Emopoli", R.drawable.gradiscahome));
        items.add(new Item("Caffè Centrale", R.drawable.gradiscahome));
        items.add(new Item("Caffè Teatro", R.drawable.gradiscahome));
        items.add(new Item("Bar Lovento", R.drawable.gradiscahome));
        items.add(new Item("Da cris", R.drawable.gradiscahome));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_bar);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        // Set an item click listener for ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent barIntent = new Intent(BarActivity.this, DetailBarActivity.class);

                barIntent.putExtra("position", position);
                barIntent.putExtra("items", items);

                startActivity(barIntent);
            }
        });
    }
}
