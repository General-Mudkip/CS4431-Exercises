package Exercise9_3;// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee ourEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // get base-salaried commission employee data
        System.out.println(
                "Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",
                ourEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                ourEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                ourEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                ourEmployee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
                ourEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is",
                ourEmployee.getBaseSalary());

        ourEmployee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                ourEmployee.toString());
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
