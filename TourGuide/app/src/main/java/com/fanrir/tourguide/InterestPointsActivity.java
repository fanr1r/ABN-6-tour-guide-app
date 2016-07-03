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
        words.add(new LocationInformation(R.drawable.a_marine_ehrenmahl_laboe, "Marine Ehrenmal Laboe", "Strandstraße 92, 24235 Laboe"));
        words.add(new LocationInformation(R.drawable.b_zoologisches_museum_kiel, "Zoologisches Museum Kiel", "Hegewischstraße 3, 24105 Kiel"));
        words.add(new LocationInformation(R.drawable.c_u_995, "U 995", "Strandstraße 92, 24235 Laboe"));
        words.add(new LocationInformation(R.drawable.d_aquarium_geomar, "Aquarium GEOMAR", "Düsternbrooker Weg 20, 24105 Kiel"));
        words.add(new LocationInformation(R.drawable.e_alter_botanischer_garten, "Alter Botanischer Garten", "Schwanenweg 14, 24105 Kiel"));
        words.add(new LocationInformation(R.drawable.f_kieler_foerde, "Kieler Förde", "Kielline"));
        words.add(new LocationInformation(R.drawable.g_sparkassen_arena, "Sparkassen-Arena", "Europapl. 1, 24103 Kiel"));
        words.add(new LocationInformation(R.drawable.h_schwentine, "Schwentine", "Holstein"));
        words.add(new LocationInformation(R.drawable.i_holstein_stadion, "Holstein Stadion", "Westring 501, 24106 Kiel"));
        words.add(new LocationInformation(R.drawable.j_postsee, "Postsee", "Preetz"));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_interest_points);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
