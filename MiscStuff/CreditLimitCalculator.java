package MiscStuff;

import java.util.ArrayList;

public class CreditLimitCalculator {
    private static class Charge {
        public String name;
        public double value;

        public Charge(String name, double value) {
            this.name = name;
            this.value = value;
        }
    }

    private static class Customer {
        public int accountNumber;
        public double startingBalance;
        public double allowedCreditLimit;

        private double creditsApplied;

        private ArrayList<Charge> charges;

        public Customer(int accountNumber, double balance, double allowedCreditLimit) {
            this.accountNumber = accountNumber;
            this.startingBalance = balance;
            this.allowedCreditLimit = allowedCreditLimit;
            this.charges = new ArrayList<>();
        }

        public void addCharge(String charge, double value) {
            if (value - this.creditsApplied < 0) {
                value = 0;
                this.creditsApplied -= value;
            } else {
                value -= this.creditsApplied;
                this.creditsApplied = 0;
            }

            this.charges.add(new Charge(charge, value));
        }

        public double getCurrentBalance() {
            double totalCharges = 0.0;
            for (Charge c: this.charges) {
                totalCharges += c.value;
            }

            return this.startingBalance + totalCharges;
        }

        public void setCreditsApplied(double totalCreditValue) {
            this.creditsApplied = totalCreditValue;
        }

        public boolean isAboveCreditLimit() {
            double diff = this.getCurrentBalance() - this.allowedCreditLimit;

            return (diff > 0);
        }
    }

    public static void main(String[] args) {
        Customer joe = new Customer(58, 1000, 2000);
        joe.setCreditsApplied(2000);
        joe.addCharge("Bricks", 2500);
        System.out.println(joe.getCurrentBalance());
        System.out.println(joe.isAboveCreditLimit());
    }
}
