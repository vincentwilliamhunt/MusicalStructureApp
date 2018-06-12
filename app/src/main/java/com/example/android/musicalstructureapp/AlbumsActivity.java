package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(AlbumsActivity.this, NowPlaying.class);
                startActivity(nowPlaying);
            }
        });

        //create an ArrayList of album objects:
        ArrayList<Album> yourAlbums = new ArrayList<Album>();

        Album anAwesomeWave = new Album("An Awesome Wave", "alt-J", R.drawable.anawesomewave);
        Album hoodwinkd = new Album("Hoodwink'd", "LVL UP", R.drawable.hoodwinkd);
        Album apricotPricess = new Album("Apricot Princess", "Rex Orange County", R.drawable.apricotprincess);

        yourAlbums.add(anAwesomeWave);
        yourAlbums.add(hoodwinkd);
        yourAlbums.add(apricotPricess);

        //now add the albumAdapter to show the albums
        AlbumAdapter albumAdapter = new AlbumAdapter(this, yourAlbums);

        //add the listview and attach the adapter:
        ListView listView = (ListView) findViewById(R.id.listview_album);
        listView.setAdapter(albumAdapter);


    }

}
