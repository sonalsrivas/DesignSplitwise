package org.example;

public class EqualSplitStrategy implements ISplitStrategy{
    @Override
    public Integer getAmountOwedBySplitStrategy(Integer amountPaid, Integer payDetail, Integer noOfUsersForWhomPaymentMade) {
        return amountPaid/noOfUsersForWhomPaymentMade;
    }
}
