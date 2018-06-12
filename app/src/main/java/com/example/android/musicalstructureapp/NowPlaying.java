package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    TextView finalTextView1;
    TextView finalTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(home);
            }
        });

        Button yourSongs = (Button) findViewById(R.id.your_songs_button);
        yourSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yourSongs = new Intent(NowPlaying.this, SongsActivity.class);
                startActivity(yourSongs);
            }
        });

        Intent incoming = getIntent();
        if (incoming == null)
            return;

        finalTextView1 = findViewById(R.id.now_playing_song);
        finalTextView2 = findViewById(R.id.now_playing_artist);
        finalTextView1.setText(incoming.getStringExtra("message_key1"));
        finalTextView2.setText(incoming.getStringExtra("message_key2"));
    }
}
