package org.example;

public interface ISplitStrategy {
    Integer getAmountOwedBySplitStrategy(Integer amountPaid, Integer payDetail, Integer noOfUsersForWhomPaymentMade);

}
