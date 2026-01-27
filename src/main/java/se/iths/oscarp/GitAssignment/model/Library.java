package se.iths.oscarp.GitAssignment.model;


public class Library {
    private int id;
    private String title;
    private String author;
    private int publishYear;

    public Library(int id, String title, String author, int publishYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
