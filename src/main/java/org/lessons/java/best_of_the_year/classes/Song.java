package org.lessons.java.best_of_the_year.classes;

public class Song {
    private int id;
    private String title;

    public Song(){}

    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Id
    public int getId() {
        return this.id;
    }

    // Title
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if(title != null && !title.equals("")) {
            this.title = title;
        }
    }
}
