package com.example.android.musicalstructureapp;

public class Song {
    private String song;
    private String album;
    private String artist;
    private int albumImageResource;

    public Song(String song, String album, String artist, int albumImageResource) {
        this.song = song;
        this.album = album;
        this.artist = artist;
        this.albumImageResource = albumImageResource;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongArtistName() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    public int getAlbumImageResource() {
        return albumImageResource;
    }
}
