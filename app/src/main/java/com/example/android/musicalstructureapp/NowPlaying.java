package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {


    TextView finalTextView1;
    TextView finalTextView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Intent incoming = getIntent();

        if (incoming == null)
            return;

        finalTextView1 = findViewById(R.id.now_playing_song);
        finalTextView2 = findViewById(R.id.now_playing_artist);
        finalTextView1.setText(incoming.getStringExtra("message_key1"));
        finalTextView2.setText(incoming.getStringExtra("message_key2"));
    }
}
