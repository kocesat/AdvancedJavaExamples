package com.kocesat.streams;

public class Movie implements Comparable<Movie>{
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        return title.compareTo(o.title);
    }
}
