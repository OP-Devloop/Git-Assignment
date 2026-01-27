package se.iths.oscarp.vblesson2.model;

public class Movie {
    private final String title;
    private final String author;
    private final int publishedYear;

    public Movie(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
