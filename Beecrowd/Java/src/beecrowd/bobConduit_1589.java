package beecrowd;

import java.util.Scanner;

public class bobConduit_1589 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nCases, num1, num2, result;

        // Read number of test cases
        nCases = sc.nextInt();

        // Bucle to process the data
        for (int i = 0; i < nCases; i++) {
            // Leer dos números
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            // Sum the numbers
            result = num1 + num2;

            // Print the result
            System.out.println(result);
        }

        sc.close(); // Close scanner


	}

}
