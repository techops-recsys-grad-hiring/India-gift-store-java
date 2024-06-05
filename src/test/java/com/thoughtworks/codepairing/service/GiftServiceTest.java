package com.thoughtworks.codepairing.service;

import com.thoughtworks.codepairing.model.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GiftServiceTest {

    @Test
    public void shouldCalculatePriceOfGifts() {
        String[] gifts = {"Teddy bear", "Ornaments", "Novel"};
        Transaction transaction = new Transaction(gifts);
        GiftService service = new GiftService();
        Double actualTransactionAmount = service.calculatePrice(transaction);

        double expectedTransactionAmount = 3570;
        assertEquals(expectedTransactionAmount, actualTransactionAmount, 0.0);
    }

    @Test
    public void shouldRaiseExceptionForInvalidNumberOfGifts() {
        String[] gifts = {};
        Transaction transaction = new Transaction(gifts);
        GiftService service = new GiftService();

        assertThrows(IllegalArgumentException.class, () -> service.calculatePrice(transaction));
    }
}

