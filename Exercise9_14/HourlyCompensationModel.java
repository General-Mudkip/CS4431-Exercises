package Exercise9_14;

public class HourlyCompensationModel extends CompensationModel {
    private double hoursWorked;
    private double hourlyWage;

    public HourlyCompensationModel(double hourlyWage, double hoursWorked) {
        if (hoursWorked < 0.0 || hoursWorked > 168.0) {
            throw new IllegalArgumentException("Hours worked cannot be less than 0 or more than the total hours in a week.");
        } else {
            this.hoursWorked = hoursWorked;
        }

        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage cannot be negative.");
        }
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage cannot be negative.");
        }
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0.0 || hoursWorked > 168.0) {
            throw new IllegalArgumentException("Hours worked cannot be less than 0 or more than the total hours in a week.");
        } else {
            this.hoursWorked = hoursWorked;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double earnings() {
        return getHourlyWage() * getHoursWorked();
    }
}
