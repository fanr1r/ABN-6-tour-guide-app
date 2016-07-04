package com.fanrir.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FerryStationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_details_list);

        ArrayList<LocationInformation> words = new ArrayList<>();
        words.add(new LocationInformation(getString(R.string.station), ""));
        words.add(new LocationInformation(getString(R.string.lake_garden), ""));
        words.add(new LocationInformation(getString(R.string.reventlou), ""));
        words.add(new LocationInformation(getString(R.string.bellevue), ""));
        words.add(new LocationInformation(getString(R.string.mountain), ""));
        words.add(new LocationInformation(getString(R.string.moeltenort), ""));
        words.add(new LocationInformation(getString(R.string.friedrichsort), ""));
        words.add(new LocationInformation(getString(R.string.falckenstein), ""));
        words.add(new LocationInformation(getString(R.string.laboe), ""));
        words.add(new LocationInformation(getString(R.string.schilksee), ""));
        words.add(new LocationInformation(getString(R.string.strande), ""));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_ferry_stations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
