package com.example.android.musicalstructureapp;

public class Artist {
    private String artistName;
    private int artistImageResourceId;

    public Artist(String artistName, int artistImageResourceId) {
        this.artistName = artistName;
        this.artistImageResourceId = artistImageResourceId;
    }

    public int getArtistImageResourceId() {
        return artistImageResourceId;
    }

    public String getArtistName() {
        return artistName;
    }
}
