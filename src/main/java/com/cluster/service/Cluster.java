package com.cluster.service;


import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by shane on 2/27/17.
 */
public class Cluster {

    private long id;
    private int maxUsers;
    private int minUsers;
    private int numUsers;
    private List<User> users;
    private long leaderID;
    private Date startTime;
    private Date endTime;
    private boolean isComplete;
    private Location location;
    private Restaurant restaurant;

    public Cluster(long id, int maxUsers, int minUsers, int numUsers, Restaurant restaurant, List<User> users, long leaderID, Date startTime, Date endTime, boolean isComplete, Location location) {
        this.id = id;
        this.maxUsers = maxUsers;
        this.minUsers = minUsers;
        this.numUsers = numUsers;
        this.users = users;
        this.leaderID = leaderID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isComplete = isComplete;
        this.location = location;
        this.restaurant = restaurant;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && ((Cluster) obj).id == this.id;
    }

    public boolean addUser(User user) {
        if (user == null) {
            return false;
        }
        users.add(user);
        return true;
    }

    public boolean removeUser(User user) {
        if (user == null) {
            return false;
        }
        users.remove(user);
        return true;
    }

    public boolean userExists(User user) {
        return users.contains(user);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public int getMinUsers() {
        return minUsers;
    }

    public void setMinUsers(int minUsers) {
        this.minUsers = minUsers;
    }

    public int getNumUsers() {
        return numUsers;
    }

    public void setNumUsers(int numUsers) {
        this.numUsers = numUsers;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public long getLeaderID() {
        return leaderID;
    }

    public void setLeaderID(long leaderID) {
        this.leaderID = leaderID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
