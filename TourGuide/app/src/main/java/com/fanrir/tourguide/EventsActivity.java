package com.fanrir.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_details_list);

        ArrayList<LocationInformation> words = new ArrayList<>();
        words.add(new LocationInformation(getString(R.string.opera), getString(R.string.date_opera)));
        words.add(new LocationInformation(getString(R.string.theater), getString(R.string.date_theater)));
        words.add(new LocationInformation(getString(R.string.rimbaud), getString(R.string.date_rimbaud)));
        words.add(new LocationInformation(getString(R.string.fatburn), getString(R.string.date_fatburn)));
        words.add(new LocationInformation(getString(R.string.orpheus), getString(R.string.date_orpheus)));
        words.add(new LocationInformation(getString(R.string.sterntaucher), getString(R.string.date_sterntaucher)));
        words.add(new LocationInformation(getString(R.string.party), getString(R.string.date_party)));
        words.add(new LocationInformation(getString(R.string.orchestra), getString(R.string.date_orchestra)));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_events);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
