package Exercise9_8;

public class HomeLoan extends Loan {
    public HomeLoan(double principle, int tenure) {
        super(principle, tenure, 0.005);
    }
}
