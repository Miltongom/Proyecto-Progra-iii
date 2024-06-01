
package com.umg.redsocialx;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Tweet> tweets;
    private List<User> followers;
    private List<User> following;

    public User(String username) {
        this.username = username;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    // Métodos para seguir, dejar de seguir, publicar tweet, etc.

    // Getters
    public String getUsername() {
        return username;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }
}

