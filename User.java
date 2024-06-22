package assignment_2;

import java.util.ArrayList;
import java.util.List;

// User class representing an individual user in the mini Twitter application
public class User extends UserComponent implements Observer {
    private String userID;          // Unique ID for the user
    private List<User> followers;   // List of followers
    private List<User> followings;  // List of users this user is following
    private List<String> newsFeed;  // List of tweets in the user's news feed

    // Constructor to initialize the user with a unique ID
    public User(String userID) {
        this.userID = userID;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.newsFeed = new ArrayList<>();
    }

    // Getter for user ID
    public String getUserID() {
        return userID;
    }

    // Getter for news feed
    public List<String> getNewsFeed() {
        return newsFeed;
    }

    // Getter for followings
    public List<User> getFollowings() {
        return followings;
    }

    // Getter for followers
    public List<User> getFollowers(){
        return followers;
    }

    // Method to follow another user
    public void follow(User user) {
        if (!followings.contains(user)) {
            followings.add(user);
            user.addFollower(this);
        }
    }

    // Method to add a follower to this user
    public void addFollower(User user) {
        if (!followers.contains(user)) {
            followers.add(user);
        }
    }

    // Method to post a tweet
    public void postTweet(String tweet) {
        newsFeed.add(tweet);
        notifyFollowers(tweet);
    }

    // Notify all followers about a new tweet
    private void notifyFollowers(String tweet) {
        for (User follower : followers) {
            follower.update(tweet);
        }
    }

    // Update news feed with a new tweet
    @Override
    public void update(String tweet) {
        newsFeed.add(tweet);
    }

    // Accept a visitor
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return userID;
    }
}
