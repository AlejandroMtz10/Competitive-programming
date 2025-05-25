package beecrowd;

import java.util.Scanner;

public class bhaskara_formula_1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
        double a, b, c, square_root, bhaskara1, bhaskara2;
		
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
		
        square_root = (b * b) - (4 * a * c);
		
        if (square_root < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            square_root = Math.sqrt(square_root);
            bhaskara1 = (-b + square_root) / (2 * a);
            bhaskara2 = (-b - square_root) / (2 * a);
			
            System.out.printf("R1 = %.5f\n", bhaskara1);
            System.out.printf("R2 = %.5f\n", bhaskara2);
        }
		
		
	}

}
