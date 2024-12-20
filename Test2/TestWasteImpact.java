package Test2;

import java.util.ArrayList;

public class TestWasteImpact {
    public static double costPerKilowattHour = 0.25; // Global variable used to calculate the cost of electricity usage

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<WasteImpact> theDevices = new ArrayList<>();

        // Instantiate and add the devices to that ArrayList
        theDevices.add(new SmartPhone("iPhone 15", 30.0, 4));
        theDevices.add(new WashingMachine("Samsung Washing Machine", 2000, 2.5, 15));
        theDevices.add(new DishWasher("Nokia Dishwasher",1500, 1.75, 60.0));

        System.out.println("Here are your devices environmental impact:");

        // Iterate through all the devices in the ArrayList
        for (WasteImpact dev: theDevices) {

            // And print out their calculated waste impact.
            System.out.printf("%nDevice %s: %s", dev.getClass().getName(), dev.calculateWasteImpact());
        }
    }
}