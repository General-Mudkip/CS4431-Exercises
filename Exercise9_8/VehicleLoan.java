package Exercise9_8;

public class VehicleLoan extends Loan {
    public VehicleLoan(double principle, int tenure) {
        super(principle, tenure, 0.09);
    }
}
