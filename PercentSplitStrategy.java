package org.example;

public class PercentSplitStrategy implements ISplitStrategy{
    @Override
    public Integer getAmountOwedBySplitStrategy(Integer amountPaid, Integer payDetail, Integer noOfUsersForWhomPaymentMade) {
        return amountPaid*payDetail/100;
    }
}
