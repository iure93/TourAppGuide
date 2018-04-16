package com.example.android.tourappguide;

/**
 * {@link Item} represents an item of the list of the different category.
 * It contains the name of the attraction and a little image for that.
 */
public class Item {

    /**
     * name of the attraction
     */
    private String mNameOfAttraction;

    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    /**
     * Create a new Word object.
     *
     * @param nameOfAttraction is the name of the attraction
     *                         *
     * @param imageResourceId  is the image ID
     */
    public Item(String nameOfAttraction, int imageResourceId) {
        mNameOfAttraction = nameOfAttraction;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the attraction
     */

    public String getNameOfAttraction() {
        return mNameOfAttraction;
    }

    /**
     * Get the id of the image
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * check if there is an image
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

}