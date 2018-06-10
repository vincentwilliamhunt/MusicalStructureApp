package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        Song currentSong = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getSong());
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.song_artist_name);
        songArtistTextView.setText(currentSong.getSongArtistName());
        ImageView songAlbumArt = (ImageView) listItemView.findViewById(R.id.song_album_art);
        songAlbumArt.setImageResource(currentSong.getAlbumImageResource());
        return listItemView;
    }
}
