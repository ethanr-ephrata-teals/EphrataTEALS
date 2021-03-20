package sampleCode.CardLab;

import java.util.Scanner;

public class War {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Let's play War!");
        System.out.print("Enter Player 1's name: ");
        String playerOne = console.nextLine();
        System.out.print("Enter Player 2's name: ");
        String playerTwo = console.nextLine();
        System.out.println();
        System.out.println("It's " + playerOne + " vs. " + playerTwo + "!");
        System.out.println();

        int[] values = {2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};

        Deck p1Deck = new Deck(values, suits);
        Deck p2Deck = new Deck(values, suits);

        p1Deck.shuffle();
        p2Deck.shuffle();

        int p1Wins = 0;
        int p2Wins = 0;

        System.out.println("Press Enter to start the game");
        console.nextLine();

        while(p1Deck.hasNext() && p2Deck.hasNext()) {
            Card p1Draw = p1Deck.draw();
            Card p2Draw = p2Deck.draw();

            System.out.println(playerOne + " draws a " + p1Draw);
            System.out.println(playerTwo + " draws a " + p2Draw);

            if (p1Draw.getValue() > p2Draw.getValue()) {
                System.out.println(playerOne + " wins the hand!");
                p1Wins++;
            } else if (p1Draw.getValue() < p2Draw.getValue()) {
                System.out.println(playerTwo + " wins the hand!");
                p2Wins++;
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
            console.nextLine();
        }

        System.out.println(playerOne + " won " + p1Wins + " hands.");
        System.out.println(playerTwo + " won " + p2Wins + " hands.");

        if (p1Wins > p2Wins) {
            System.out.println(playerOne + " wins the game!");
        } else if (p1Wins < p2Wins) {
            System.out.println(playerTwo + " wins the game!");
        } else {
            System.out.println("It's a tie!");
        }


    }
}
