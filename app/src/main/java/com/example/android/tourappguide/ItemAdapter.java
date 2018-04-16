package com.example.android.tourappguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    /**
     * {@link ItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link Item} objects.
     */

        private int mColorResourceId;
        /**
         * Create a new {@link ItemAdapter} object.
         *
         * @param context is the current context (i.e. Activity) that the adapter is being created in.
         * @param item is the list of {@link Item}s to be displayed.
         */
        public ItemAdapter(Context context, ArrayList<Item> item, int colorResourceId) {
            super(context, 0, item);
            mColorResourceId = colorResourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link Word} object located at this position in the list
            Item currentItem = getItem(position);

            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            textContainer.setBackgroundColor(color);

            // Find the TextView in the list_item.xml layout with the ID item_name.
            TextView itemTextView = (TextView) listItemView.findViewById(R.id.item_name);

            // Get the name of the attraction from the currentItem object and set this text on
            // the item TextView.
            itemTextView.setText(currentItem.getNameOfAttraction());


            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView image = (ImageView) listItemView.findViewById(R.id.item_image);
            // Get the image resource ID from the current Word object and
            // set the image to iconView
                image.setImageResource(currentItem.getImageResourceId());



            // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
            // the ListView.
            return listItemView;
        }
    }