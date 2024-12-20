package Exercise9_8;

public class Loan {
    private double principle;
    private int tenure;
    private double monthlyInterest;
    private double monthlyInstallment;

    public Loan(double principle, int tenure, double interest) {
        this.principle = principle;
        this.tenure = tenure;
        this.monthlyInterest = interest;

        this.monthlyInstallment = principle * interest * (Math.pow(1.0 + interest, tenure) / (Math.pow(1.0 + interest, tenure)-1));
    }

    public double getPrinciple() {
        return principle;
    }

    public int getTenure() {
        return tenure;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }
}
