package MiscStuff;

import java.util.Arrays;
import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] allNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            allNumbers[i] = input.nextInt();
        }

        Arrays.sort(allNumbers);
        System.out.printf("%d %d", allNumbers[9], allNumbers[8]);
    }
}