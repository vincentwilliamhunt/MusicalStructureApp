package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album>{

    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_album, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_album.xml layout with the ID album_title
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_title);
        // Get the album name from the current Album and
        // set this text on the name albumTextView
        albumTextView.setText(currentAlbum.getAlbum());

        // Find the TextView in the list_item.xml layout with the ID artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        // Get the artist name from the current Album object and
        // set this text on the artist TextView
        artistTextView.setText(currentAlbum.getArtist());

        // Find the ImageView in the list_album.xml layout with the ID album_art
        ImageView albumArt = (ImageView) listItemView.findViewById(R.id.album_art);
        // Get the image resource ID from the current Album object and
        // set the image to albumArt
        albumArt.setImageResource(currentAlbum.getAlbumImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
