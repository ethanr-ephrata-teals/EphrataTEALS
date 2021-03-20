package sampleCode.CardLab;

public class Deck {
    private Card[] cards;
    private int nextCard;

    public Deck() {
        int[] values = {2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits =  {"spades", "clubs", "diamonds", "hearts"};
        this.initializeCards(values, suits);
    }

    public Deck(int[] values, String[] suits) {
        this.initializeCards(values, suits);
    }

    public Deck(Card[] cards) {
        this.cards = cards;
        this.nextCard = 0;
    }

    private void initializeCards(int[] values, String[] suits) {
        int totalCards = values.length * suits.length;
        this.cards = new Card[totalCards];
        int i = 0;
        for (int value : values) {
            for (String suit : suits) {
                this.cards[i] = new Card(value, suit);
                i++;
            }
        }
        this.nextCard = 0;
    }

    public void shuffle() {
        CardShuffler shuffler = new CardShuffler();
        this.cards = shuffler.shuffle(this.cards);
        this.nextCard = 0;
    }

    public Card draw() {
        Card card = this.cards[this.nextCard];
        this.nextCard++;
        return card;
    }

    public boolean hasNext() {
        return this.nextCard <= cards.length - 1;
    }

    public String toString() {
        String s = "Deck with " + this.cards.length + " cards. ";
        s += "Next card is " + this.cards[this.nextCard].toString();
        return s;
    }
}
