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
        words.add(new LocationInformation("Oper für Kinder", "03.07.2016 in der Niederdeutschen Bühne Kiel"));
        words.add(new LocationInformation("Blame It On The Moondog", "03.07.2016 im Theater Kiel"));
        words.add(new LocationInformation("Von Rimbaud bis Schubert", "04.07.2016 im Theater Kiel"));
        words.add(new LocationInformation("FatburnX", "04.07.2016 im FitX"));
        words.add(new LocationInformation("Orpheus & Eurydike", "06.07.2016 im Theater Kiel"));
        words.add(new LocationInformation("Dr. Motte", "08.07.2016 im Sterntaucher"));
        words.add(new LocationInformation("Mega90er live", "09.07.2016 im Minigolf am Norder"));
        words.add(new LocationInformation("Orchesterakademie", "10.07.2016 im Schauspielhaus Kiel"));

        LocationInformationAdapter itemsAdapter = new LocationInformationAdapter(this, words, R.color.category_events);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
