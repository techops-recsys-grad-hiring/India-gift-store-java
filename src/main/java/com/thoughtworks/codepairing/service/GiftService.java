package com.thoughtworks.codepairing.service;

import com.thoughtworks.codepairing.model.GiftType;
import com.thoughtworks.codepairing.model.Transaction;
import com.thoughtworks.codepairing.model.Gift;

import java.util.ArrayList;

public class GiftService {
    public static final ArrayList<Gift> giftStoreItems = new ArrayList<>();
    private static final int GST_PERCENTAGE = 5;

    static {
        giftStoreItems.add(new Gift(GiftType.STANDARD, "Teddy bear", 600));
        giftStoreItems.add(new Gift(GiftType.STANDARD, "Chocolates", 1000));
        giftStoreItems.add(new Gift(GiftType.STANDARD, "Novel", 800));
        giftStoreItems.add(new Gift(GiftType.PREMIUM, "Photo frame", 1500));
        giftStoreItems.add(new Gift(GiftType.PREMIUM, "Ornaments", 2000));
        giftStoreItems.add(new Gift(GiftType.PREMIUM, "Personalized Caricature", 1800));
    }

    public double calculatePrice(Transaction transaction){
        //TODO: logic to calculate the price of items purchased
        return 0;
    }
}