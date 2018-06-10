package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        String altJ = "alt-J";
        int awesomeWave = R.drawable.anawesomewave;
        String awesomeWaveString = "An Awesome Wave";
        String lvlUp = "LVL UP";
        int hoodwinkd = R.drawable.hoodwinkd;
        String hoodwinkdString = "Hoodwink'd";
        String rexOc = "Rex Orange County";
        int apricotPrincess = R.drawable.apricotprincess;
        String apricotPrincessString = "Apricot Princess";

        ArrayList<Song> songs = new ArrayList<Song>();

        Song intro = new Song("Intro", awesomeWaveString, altJ, awesomeWave);
        Song interludeOne = new Song("Interlude 1", awesomeWaveString, altJ, awesomeWave);
        Song tessellate = new Song("Tessellate", awesomeWaveString, altJ, awesomeWave);
        Song breezeblocks = new Song("Breezeblocks", awesomeWaveString, altJ, awesomeWave);
        Song angelFromSpace = new Song("Angel From Space", hoodwinkdString, lvlUp, hoodwinkd);
        Song stonedAlone = new Song("Stoned Alone", hoodwinkdString, lvlUp, hoodwinkd);
        Song dbts = new Song("DBTS", hoodwinkdString, lvlUp, hoodwinkd);
        Song apricotP = new Song("Apricot Princess", apricotPrincessString, rexOc, apricotPrincess);
        Song tele = new Song("Television / So Far So Good", apricotPrincessString, rexOc, apricotPrincess);
        Song never = new Song("Never Enough", apricotPrincessString, rexOc, apricotPrincess);

        songs.add(intro);
        songs.add(interludeOne);
        songs.add(tessellate);
        songs.add(breezeblocks);
        songs.add(angelFromSpace);
        songs.add(stonedAlone);
        songs.add(dbts);
        songs.add(apricotP);
        songs.add(tele);
        songs.add(never);

        SongAdapter songAdapter = new SongAdapter(this, songs);
        final ListView listView = (ListView)findViewById(R.id.listview_song);
        listView.setAdapter(songAdapter);

        //Set a onitemclicklistener on the song ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = (Song) listView.getItemAtPosition(position);
                Intent nowPlayingScreen = new Intent(SongsActivity.this, NowPlaying.class);

                nowPlayingScreen.putExtra("message_key1", song.getSong());
                nowPlayingScreen.putExtra("message_key2", song.getSongArtistName());
                nowPlayingScreen.putExtra("message_key3", song.getAlbumImageResource());
                startActivity(nowPlayingScreen);
            }
        });

    }
}
