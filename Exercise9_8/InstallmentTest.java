package Exercise9_8;

public class InstallmentTest {
    public static void main(String[] args) {
        System.out.println("HI!");

        HomeLoan myMortgage = new HomeLoan(300_000, 300);
        System.out.println(myMortgage.getMonthlyInstallment());

        VehicleLoan myCar = new VehicleLoan(40_000, 60);
        System.out.println(myCar.getMonthlyInstallment());

        PersonalLoan myLoan = new PersonalLoan(10_000, 12);
        System.out.println(myLoan.getMonthlyInstallment());

        Loan[] testArray = new Loan[3];
        testArray[0] = myCar;
        testArray[1] = myMortgage;
        testArray[2] = myLoan;
    }
}
