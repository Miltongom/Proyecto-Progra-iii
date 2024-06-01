
package com.umg.redsocialx;
import java.util.LinkedList;

public class Tweet {
    private String text;
    private LinkedList<String> comments;
    private LinkedList<String> likes;

    public Tweet(String text) {
        this.text = text;
        this.comments = new LinkedList<>();
        this.likes = new LinkedList<>();
    }

    // Getters and Setters

    public String getText() {
        return text;
    }

    public LinkedList<String> getComments() {
        return comments;
    }

    public LinkedList<String> getLikes() {
        return likes;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void removeComment(String comment) {
        comments.remove(comment);
    }

    public void addLike(String user) {
        if (!likes.contains(user)) {
            likes.add(user);
        }
    }

    public void removeLike(String user) {
        likes.remove(user);
    }
}
