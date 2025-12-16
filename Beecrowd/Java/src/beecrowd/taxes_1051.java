package beecrowd;

import java.util.Scanner;
import java.util.Locale;

public class taxes_1051 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double salary = sc.nextDouble();
        double totalTaxes = 0.0;
        double excessSalary;

        // Tax-free salary
        if (salary <= 2000.00) {
            System.out.println("Isento");
            return;
        }

        // Amount subject to taxes
        excessSalary = salary - 2000.00;

        // 8% tax bracket (up to 3000.00)
        if (excessSalary > 0.0) {
            double portion = Math.min(excessSalary, 1000.00);
            totalTaxes += portion * 0.08;
            excessSalary -= portion;
        }

        // 18% tax bracket (up to 4500.00)
        if (excessSalary > 0.0) {
            double portion = Math.min(excessSalary, 1500.00);
            totalTaxes += portion * 0.18;
            excessSalary -= portion;
        }

        // 28% tax bracket (above 4500.00)
        if (excessSalary > 0.0) {
            totalTaxes += excessSalary * 0.28;
        }

        System.out.printf("R$ %.2f%n", totalTaxes);
        sc.close();
    }
}