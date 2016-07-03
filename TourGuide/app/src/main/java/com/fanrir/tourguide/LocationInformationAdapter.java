package com.fanrir.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eisdrachl on 03.07.2016.
 */
public class LocationInformationAdapter extends ArrayAdapter<LocationInformation> {
    /** Resource ID for the background color for this list of location details */
    private int mColorResId;

    public LocationInformationAdapter(Activity context, ArrayList<LocationInformation> words, int colorResId) {
        super(context, 0, words);
        mColorResId = colorResId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LocationInformation locationInformation = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
        if (locationInformation.hasImage()) {
            imageView.setImageResource(locationInformation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.name_text_view);
        miwokTextView.setText(locationInformation.getLocationName());

        TextView translationTextView = (TextView) convertView.findViewById(R.id.description_text_view);
        translationTextView.setText(locationInformation.getDescription());

        LinearLayout wordsViewGroup = (LinearLayout) convertView.findViewById(R.id.location_details_view_group);
        wordsViewGroup.setBackgroundResource(mColorResId);

        return convertView;
    }
}
