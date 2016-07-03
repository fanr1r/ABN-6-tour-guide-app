package com.fanrir.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the ferryStation category
        TextView ferryStation = (TextView) findViewById(R.id.ferry_stations);

        // Set a click listener on that View
        ferryStation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ferryStation category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, FerryStationsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the interestPoints category
        TextView interestPoints = (TextView) findViewById(R.id.interest_points);

        // Set a click listener on that View
        interestPoints.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the interestPoints category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, InterestPointsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the events category
        TextView events = (TextView) findViewById(R.id.events);

        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the events category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}
