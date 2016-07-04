package com.fanrir.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class InterestPointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_details_list);

        ArrayList<LocationInformation> words = new ArrayList<>();
        words.add(new LocationInformation(R.drawable.a_marine_ehrenmahl_laboe, getString(R.string.marine), getString(R.string.marine_adress)));
        words.add(new LocationInformation(R.drawable.b_zoologisches_museum_kiel, getString(R.string.zoo), getString(R.string.zoo_adress)));
        words.add(new LocationInformation(R.drawable.c_u_995, getString(R.string.submarine), getString(R.string.submarine_adress)));
        words.add(new LocationInformation(R.drawable.d_aquarium_geomar, getString(R.string.aquarium), getString(R.string.aquarium_adress)));
        words.add(new LocationInformation(R.drawable.e_alter_botanischer_garten, getString(R.string.old_garden), getString(R.string.old_garden_adress)));
        words.add(new LocationInformation(R.drawable.f_kieler_foerde, getString(R.string.foerde), getString(R.string.foerde_adress)));
        words.add(new LocationInformation(R.drawable.g_sparkassen_arena, getString(R.string.arena), getString(R.string.arena_adress)));
        words.add(new LocationInformation(R.drawable.h_schwentine, getString(R.string.schwentine), getString(R.string.schwentine_adress)));
        words.add(new LocationInformation(R.drawable.i_holstein_stadion, getString(R.string.stadion), getString(R.string.stadion_adress)));
        words.add(new LocationInformation(R.drawable.j_postsee, getString(R.string.lake), getString(R.string.lake_adress)));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_interest_points);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
