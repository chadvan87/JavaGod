package com.god.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    //Constructor: Method to initialize the new Object of the class
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS,Rank.ACE);
        Card card2 = new Card(Suit.DIAMOND,Rank.FOUR);

    }

    public int getValue(){
        switch (this.rank){
            case JACK,QUEEN,KING -> 10;

        };
    }


}
