package com.thoughtworks.codepairing;

import com.thoughtworks.codepairing.model.Transaction;
import com.thoughtworks.codepairing.service.GiftService;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GiftStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Gift Store!");
        System.out.print("Enter number of gifts: ");

        int numberOfGifts = parseInt(scanner.nextLine());

        System.out.print("Enter gift names: ");
        String gifts_input = scanner.nextLine();
        String[] gifts = Arrays.stream(gifts_input.split(",")).map(String::trim).toArray(String[]::new);
        if (gifts.length != numberOfGifts) {
            System.out.println("Please enter correct number of gifts!");
            return;
        }

        Transaction transaction = new Transaction(gifts);
        GiftService giftService = new GiftService();
        Double transactionAmount = giftService.calculatePrice(transaction);
        System.out.println("Thanks for Transaction of amount: ₹" + transactionAmount);
    }
}