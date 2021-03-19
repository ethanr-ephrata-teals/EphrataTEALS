package sampleCode.CardLab;

public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public String toString() {
        String valueString;
        if (this.value == 13) {
            valueString = "A";
        } else if (this.value == 12) {
            valueString = "K";
        } else if (this.value == 11) {
            valueString = "Q";
        } else if (this.value == 10) {
            valueString = "J";
        } else {
            valueString = String.valueOf(this.value);
        }

        return valueString + " of " + this.suit;
    }
}
