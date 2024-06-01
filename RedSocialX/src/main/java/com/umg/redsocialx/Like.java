
package com.umg.redsocialx;

import java.time.LocalDateTime;

public class Like {
    private User user;
    private LocalDateTime timestamp;

    public Like(User user) {
        this.user = user;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public User getUser() {
        return user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
