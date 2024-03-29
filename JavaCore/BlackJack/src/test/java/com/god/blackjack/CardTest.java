package com.god.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void canGetValueOfATwoCard() {
        Card card1 = new Card(Suit.DIAMOND, Rank.TWO);
        assertEquals(2,card1.getValue());
    }

    @Test
    void canGetValueOfAThreeCard() {
        Card card1 = new Card(Suit.DIAMOND, Rank.THREE);
        assertEquals(3,card1.getValue());
    }
}