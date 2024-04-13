package org.example;

public class T15_MusicPlayer {
    String track;
    private static final T15_MusicPlayer instance = new T15_MusicPlayer();
    private T15_MusicPlayer() {}

    static T15_MusicPlayer getInstance() {
        return instance;
    }

    public void setTrack(String track) {
        this.track = track;
        System.out.println("Track '" + track + "' set.");
    }

    public void playTrack() {
        System.out.println("Playing track: " + this.track);
    }
}
