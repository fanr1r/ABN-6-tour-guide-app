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
        words.add(new LocationInformation("Block House Kiel", "Willestraße 4-6"));
        words.add(new LocationInformation("Der Bauch von Kiel", "Legienstraße 16"));
        words.add(new LocationInformation("Gaststätte Ratskeller", "Fleethörn 9"));
        words.add(new LocationInformation("Restaurant im Schloss", "Wall 74"));
        words.add(new LocationInformation("September", "Alte Lübecker Chaussee 27"));
        words.add(new LocationInformation("TanTamar", "Steinstraße 1"));
        words.add(new LocationInformation("Ristorante Rigoletto", "Königsweg 46"));
        words.add(new LocationInformation("Längengrad Restaurant", "Schwedenkai 1"));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
