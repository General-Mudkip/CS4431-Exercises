package MiscStuff;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int max = input.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter a number:");
            int userNum = input.nextInt();
            if (userNum > max) {
                max = userNum;
            }
        }

        System.out.println(max);
    }
}
