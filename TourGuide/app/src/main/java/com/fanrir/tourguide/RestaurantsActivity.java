package com.fanrir.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_details_list);

        ArrayList<LocationInformation> words = new ArrayList<>();
        words.add(new LocationInformation(getString(R.string.block_house), getString(R.string.block_house_adress)));
        words.add(new LocationInformation(getString(R.string.stomach), getString(R.string.stomach_adress)));
        words.add(new LocationInformation(getString(R.string.ratskeller), getString(R.string.ratskeller_adress)));
        words.add(new LocationInformation(getString(R.string.castle), getString(R.string.castle_adress)));
        words.add(new LocationInformation(getString(R.string.september), getString(R.string.september_adress)));
        words.add(new LocationInformation(getString(R.string.tantamar), getString(R.string.tantamar_adress)));
        words.add(new LocationInformation(getString(R.string.rigoletto), getString(R.string.rigoletto_adress)));
        words.add(new LocationInformation(getString(R.string.longitude), getString(R.string.longitude_adress)));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
