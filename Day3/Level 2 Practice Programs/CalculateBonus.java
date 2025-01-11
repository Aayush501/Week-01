// importing scanner class for input
import java.util.Scanner;

public class CalculateBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object of scanner class
        
		// created one final integer variable, EMPLOYEE_COUNT and four double type arrays, salaries, yearsOfService, bonuses, and newSalaries
		// the size of all below arrays is same as the value of EMPLOYEE_COUNT
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
		
		// created three double variables, totalOldSalary, totalBonus, and totalNewSalary, and assigned all of them with 0
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

		// Taking input of employee salary and year of service
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double salary = scanner.nextDouble();
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                i--; // Decrementing index to retry the input for the same employee
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
		
		// displaying the output

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n", (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
