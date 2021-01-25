package sampleCode;

import java.util.Scanner;

public class FencepostAndSentinel {
    public static void main(String[] args) {
        //fencepost();
        sentinel();
    }

    public static void fencepost() {
        // Print the integers 0-9, separated by commas
        // and followed by a new line.
        // Desired output:
        // 0,1,2,3,4,5,6,7,8,9

        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void sentinel() {
        // Get an undetermined number of integers from the user
        // print the sum of all of the numbers.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input = 0;
        while (input != -1) {
            System.out.print("Enter a number (-1 to quit): ");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("The sum is " + sum);


    }
}