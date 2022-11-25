package org.example;

public class ExactSplitStrategy implements ISplitStrategy {
    @Override
    public Integer getAmountOwedBySplitStrategy(Integer amountPaid, Integer payDetail, Integer noOfUsersForWhomPaymentMade) {
        return payDetail;
    }
}
