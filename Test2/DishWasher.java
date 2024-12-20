package Test2;

public class DishWasher implements WasteImpact {
    public String modelName;
    public double powerRating; // in Watts
    public double hoursUsedPerDay; // in Hours
    public double waterUsage;

    public DishWasher(String modelName, double powerRating, double hoursUsedPerDay, double waterUsage) {
        this.modelName = modelName;
        this.powerRating = powerRating;
        this.hoursUsedPerDay = hoursUsedPerDay;
        this.waterUsage = waterUsage;
    }

    protected double calculateElectricityUsage() {
        return this.hoursUsedPerDay * this.powerRating;
    }

    @Override
    public String calculateWasteImpact() {
        return String.format(
                "The %s, uses about %.2f watt hours of electricity per day (Worth roughly %.2f euro), and %.2f liters of water per day.",
                this.modelName,
                calculateElectricityUsage(), // Hours * watts = 'watt-hours'
                calculateElectricityUsage() / 1000 * TestWasteImpact.costPerKilowattHour, // Divide by a thousand to convert watt-hours to kilowatt-hours
                this.waterUsage
        );
    }
}