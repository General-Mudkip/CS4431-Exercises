package Exercise9_3;// Fig. 9.9: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee inherits protected instance   
// variables from CommissionEmployee.

public class BasePlusCommissionEmployee extends Object{
    private double baseSalary; // base salary per week
    private final CommissionEmployee employee;

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        this.employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public CommissionEmployee getEmployee() {
        return this.employee;
    }

    public String getFirstName() {
        return this.employee.getFirstName();
    }

    public String getLastName() {
        return this.employee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return this.employee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return this.employee.getGrossSales();
    }

    public double getCommissionRate() {
        return this.employee.getCommissionRate();
    }

    // return base salary
    public double getBaseSalary() {return baseSalary;}

    public double earnings() {
        return baseSalary + (this.employee.commissionRate * this.employee.grossSales);
    }

    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", this.employee.firstName, this.employee.lastName,
                "social security number", this.employee.socialSecurityNumber,
                "gross sales", this.employee.grossSales, "commission rate", this.employee.commissionRate,
                "base salary", baseSalary);
    }
}



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
