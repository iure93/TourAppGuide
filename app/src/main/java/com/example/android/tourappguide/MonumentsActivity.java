package com.example.android.tourappguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        // Create a list of item
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Fortezza di Gradisca d'Isonzo", R.drawable.gradiscahome));
        items.add(new Item("Duomo dei Santi Pietro e Paolo", R.drawable.gradiscahome));
        items.add(new Item("Loggia dei Mercanti", R.drawable.gradiscahome));
        items.add(new Item("Colonna della Redenzione", R.drawable.gradiscahome));
        items.add(new Item("Polveriera Veneta", R.drawable.gradiscahome));
        items.add(new Item("Galleria d’arte Luigi Spazzapan", R.drawable.gradiscahome));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_monument);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        // Set an item click listener for ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent monumentsIntent = new Intent(MonumentsActivity.this, DetailBarActivity.class);
                startActivity(monumentsIntent);
            }
        });

    }
}
