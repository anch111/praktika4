package org.example;

import java.util.Objects;

public class ConcertEvent extends Event{

    private String artistName;
    private String genre;

    public ConcertEvent(String name, String date, String place, double price, String artistName, String genre) {
        super(name, date, place, price);
        this.artistName = artistName;
        this.genre = genre;
    }

    public String getArtistName(){return artistName;}
    public String getGenre(){return genre;}

    public String getDescription(){
        return super.getDescription() + ", артист: " + artistName + ", жанр:" + genre;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!super.equals(other)){ return false;}
        ConcertEvent event = (ConcertEvent) other;
        return artistName.equals(event.artistName) && genre.equals(event.genre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), artistName, genre);
    }

    @Override
    public String toString() {
        return super.toString() + ", artist name: " + artistName + ", genre: " + genre + "}";
    }
}
