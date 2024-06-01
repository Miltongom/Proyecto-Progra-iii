
package com.umg.redsocialx;
import java.io.Serializable;

public class Comment implements Serializable {
    private String text;
    private String user;

    public Comment(String text, String user) {
        this.text = text;
        this.user = user;
    }

    // Getters y Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

    
