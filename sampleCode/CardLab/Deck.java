package sampleCode.CardLab;

public class Deck {
    private Card[] cards;
    private int nextCard;

    public void shuffle() {
        Shuffler shuffler = new Shuffler();
        this.cards = shuffler.shuffle(this.cards);
    }

    public Card draw() {
        Card card = this.cards[this.nextCard];
        this.nextCard++;
        return card;
    }

    public boolean hasNext() {
        return this.nextCard == cards.length - 1;
    }

    public String toString() {
        String s = "Deck with " + this.cards.length + " cards. ";
        s += "Next card is " + this.cards[this.nextCard].toString();
        return s;
    }
}
