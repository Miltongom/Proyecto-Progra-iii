package com.umg.redsocialx;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Stack;

@ManagedBean
@SessionScoped
public class TweetBean {
    private String tweetText;
    private Stack<Tweet> tweetStack;

    public TweetBean() {
        tweetStack = new Stack<>();
    }

    // Getters and Setters

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public Stack<Tweet> getTweets() {
        return tweetStack;
    }

    // Methods

    public void postTweet() {
        if (tweetText != null && !tweetText.isEmpty()) {
            tweetStack.push(new Tweet(tweetText));
            tweetText = "";
        }
    }

    public void deleteLatestTweet() {
        if (!tweetStack.isEmpty()) {
            tweetStack.pop();
        }
    }

    public void addCommentToTweet(Tweet tweet, String comment) {
        tweet.addComment(comment);
    }

    public void removeCommentFromTweet(Tweet tweet, String comment) {
        tweet.removeComment(comment);
    }

    public void likeTweet(Tweet tweet, String user) {
        tweet.addLike(user);
    }

    public void unlikeTweet(Tweet tweet, String user) {
        tweet.removeLike(user);
    }
}
