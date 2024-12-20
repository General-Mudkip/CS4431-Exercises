package Test2;

public class SmartPhone implements WasteImpact {
    public String modelName;
    public double batteryUsage; // in Watts
    public double screenTime; // in Hours

    public SmartPhone(String modelName, double batteryUsage, double screenTime) {
        this.modelName = modelName;
        this.screenTime = screenTime;
        this.batteryUsage = batteryUsage;
    }

    protected double calculateElectricityUsage() {
        return this.batteryUsage * this.screenTime;
    }

    @Override
    public String calculateWasteImpact() {
        return String.format(
                "The %s, with a screen time of %.1f hours, uses on average %.2f watt hours of power. That's about %.2f euros of electricity per day.",
                this.modelName,
                this.screenTime,
                calculateElectricityUsage(), // Hours * watts = 'watt-hours'
                calculateElectricityUsage() / 1000 * TestWasteImpact.costPerKilowattHour // Divide by a thousand to convert watts to kilowatts
        );
    }
}