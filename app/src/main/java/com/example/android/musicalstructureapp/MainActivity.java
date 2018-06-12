package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView artists = (TextView) findViewById(R.id.your_artists);

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.your_albums);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.your_songs);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlaying);
            }
        });

    }
}
