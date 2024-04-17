package com._9_ninth;

public class Book extends Resource {

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean search(String query) {
        return getTitle().toLowerCase().contains(query.toLowerCase()) ||
               author.toLowerCase().contains(query.toLowerCase());
    }



}
