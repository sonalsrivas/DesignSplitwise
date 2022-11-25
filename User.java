package org.example;

import java.util.HashMap;
import java.util.Map;

public class User {

    private final String name;
    private HashMap<User, Integer> mapAmountOwedToOtherPeople;

    public User(String name) {
        this.name=name;
        this.mapAmountOwedToOtherPeople=new HashMap<User, Integer>();
    }

    public void updateBalanceForPaymentMade(Integer amountPaid, ISplitStrategy splitStrategy, HashMap<User, Integer> mapUserToStrategyDetails){
        Integer noOfUsersForWhomPaymentMade=mapUserToStrategyDetails.size();
        for(Map.Entry<User, Integer> entry : mapUserToStrategyDetails.entrySet()){
            User user=entry.getKey();
            Integer payDetail = entry.getValue();
            if (user == this)
                continue;
            Integer amountOwedByUserToThis = splitStrategy.getAmountOwedBySplitStrategy(amountPaid, payDetail, noOfUsersForWhomPaymentMade);
            mapAmountOwedToOtherPeople.put(
                    user,
                    mapAmountOwedToOtherPeople.getOrDefault(user, 0) - amountOwedByUserToThis
            );
            user.mapAmountOwedToOtherPeople.put(
                    this,
                    user.mapAmountOwedToOtherPeople.getOrDefault(this, 0) + amountOwedByUserToThis
            );

        }

    }

}
