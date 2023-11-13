package day33_a_static;

public class Song {
    String name;
    double length;
    String artist;
    String genre;
    public Song(String name, double length, String artist, String genre) {
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }
    public String toString() {
        return artist + "'s new song called \"" + name + "\" was a hit " + genre + " song in 2010 and it's duration is " + length + " minutes.";
    }
}