package MiscStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> milesDriven = new ArrayList<Integer>();
        ArrayList<Integer> gallonsUsed = new ArrayList<Integer>();

        int counter = 0;
        Boolean isLooping = true;

        while (isLooping) {
            System.out.println("Enter your miles driven this trip, or 0 to exit.");
            Integer newMiles = scanner.nextInt();

            if (newMiles == 0) {
                isLooping = false;
                break;
            }

            System.out.println("\nEnter your gallons used this trip.");
            Integer newGallons = scanner.nextInt();

            milesDriven.add(newMiles);
            gallonsUsed.add(newGallons);
        }

        for (int i = 0; i < milesDriven.size(); i++) {
            double milesPerGallon = ((double) milesDriven.get(i)) / ((double) gallonsUsed.get(i));
            System.out.printf("%nYour miles per gallon for trip %d was %.3f.", i + 1, milesPerGallon);
        }
    }
}
