package Test2;

public class WashingMachine implements WasteImpact {
    public String modelName;
    public double powerRating; // in Watts
    public double hoursUsedPerDay; // in Hours
    public double detergentCost; // in euro

    public WashingMachine(String modelName, double powerRating, double hoursUsedPerDay, double detergentCost) {
        this.modelName = modelName;
        this.powerRating = powerRating;
        this.hoursUsedPerDay = hoursUsedPerDay;
        this.detergentCost = detergentCost;
    }

    protected double calculateElectricityUsage() {
        return this.hoursUsedPerDay * this.powerRating;
    }

    @Override
    public String calculateWasteImpact() {
        return String.format(
                "The %s, uses about %.2f watt hours of electricity per day (Worth roughly %.2f euro), and %.2f euros worth of detergent per day.",
                this.modelName,
                calculateElectricityUsage(), // Hours * watts = 'watt-hours'
                calculateElectricityUsage() / 1000 * TestWasteImpact.costPerKilowattHour, // Divide by a thousand to convert watts to kilowatts
                this.detergentCost
        );
    }
}
