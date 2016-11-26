package com.example.pgodara.listviewexample;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Simple array with a list of my favorite TV shows
                 String[] favoriteTVShows = {"Pushing Daisies", "Better Off Ted",
                "Twin Peaks", "Freaks and Geeks", "Orphan Black", "Walking Dead",
                "Breaking Bad", "The 400", "Alphas", "Life on Mars"};

        ListAdapter theAdapter = new MyAdapter(this,favoriteTVShows);
        ListView theListview = (ListView)findViewById(R.id.theListView);
        theListview.setAdapter(theAdapter);
       theListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              String tvShowPicked = "You selected"+ String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,tvShowPicked,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
