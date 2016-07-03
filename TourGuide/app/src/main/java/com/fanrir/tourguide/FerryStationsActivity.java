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
        words.add(new LocationInformation("Bahnhof", ""));
        words.add(new LocationInformation("Seegarten", ""));
        words.add(new LocationInformation("Reventlou", ""));
        words.add(new LocationInformation("Bellevue", ""));
        words.add(new LocationInformation("Mönkeberg", ""));
        words.add(new LocationInformation("Möltenort", ""));
        words.add(new LocationInformation("Friedrichsort", ""));
        words.add(new LocationInformation("Falckenstein", ""));
        words.add(new LocationInformation("Laboe", ""));
        words.add(new LocationInformation("Schilksee", ""));
        words.add(new LocationInformation("Strande", ""));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_ferry_stations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
