package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<Artist> artists = new ArrayList<Artist>();
        Artist altJ = new Artist("alt-J ", R.drawable.altjprofilepic);
        Artist lvlUp = new Artist("LVL UP", R.drawable.lvlupprofilepic);
        Artist rexOc = new Artist("Rex Orange County", R.drawable.rexprofilepic);

        artists.add(altJ);
        artists.add(lvlUp);
        artists.add(rexOc);

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        ListView listView = (ListView) findViewById(R.id.listview_artist);

        listView.setAdapter(artistAdapter);

    }
}
