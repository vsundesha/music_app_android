package com.example.android.music;

public class Song {
    private String name;
    private double duration;
    private String artist;

    public Song(String name, double duration, String artist) {
        this.name = name;
        this.duration = duration;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }
}
