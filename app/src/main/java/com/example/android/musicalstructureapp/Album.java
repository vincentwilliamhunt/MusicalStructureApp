package com.example.android.musicalstructureapp;

public class Album {
    private String album;
    private String artist;
    private int albumImageResourceId;

    public Album(String album, String artist, int albumImageResourceId){
        this.album = album;
        this.artist = artist;
        this.albumImageResourceId = albumImageResourceId;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getAlbumImageResourceId() {
        return albumImageResourceId;
    }
}
