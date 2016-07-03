package com.fanrir.tourguide;

/**
 * Created by Eisdrachl on 03.07.2016.
 */
public class LocationInformation {

    /** Name of location */
    private String mLocationName;

    /** Details for location */
    private String mDescription;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new LocationInformation object.
     *
     * @param name of the location
     * @param description for the location detail
     */
    public LocationInformation(String name, String description) {
        mLocationName = name;
        mDescription = description;
    }

    /**
     * Create a new Word object.
     *
     * @param name of the location
     * @param description for the location detail
     * @param imageResourceId is the drawable resource ID for the image associated with the LocationInformation
     *
     */
    public LocationInformation(int imageResourceId, String name, String description) {
        mLocationName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the name of the location.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the description of the location.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the LocationInformation.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this LocationInformation.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
