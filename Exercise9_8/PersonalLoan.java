package Exercise9_8;

public class PersonalLoan extends Loan {
    public PersonalLoan(double principle, int tenure) {
        super(principle, tenure, 0.03);
    }
}
