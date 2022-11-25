package org.example;

import java.util.HashSet;

public class SplitwiseSystem {
    private HashSet<User> groupUsers;

    public SplitwiseSystem() {
        this.groupUsers=new HashSet<>();

    }
    public void addUser(User user){
        groupUsers.add(user);
    }

}
