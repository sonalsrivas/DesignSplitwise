package org.example;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SplitwiseSystem splitwiseSystem = new SplitwiseSystem();
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        User u4 = new User("u4");
        splitwiseSystem.addUser(u1);
        splitwiseSystem.addUser(u2);
        splitwiseSystem.addUser(u3);
        splitwiseSystem.addUser(u4);

        EqualSplitStrategy equal = new EqualSplitStrategy();
        ExactSplitStrategy exact = new ExactSplitStrategy();
        PercentSplitStrategy percent = new PercentSplitStrategy();
        u1.updateBalanceForPaymentMade(1000, equal, new HashMap<>());

    }
}