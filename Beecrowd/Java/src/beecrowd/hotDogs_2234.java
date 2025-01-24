package beecrowd;

import java.util.Scanner;

public class hotDogs_2234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        // Read total hot dogs (H) and participants (P)
        int H = sc.nextInt();
        int P = sc.nextInt();

        // Calculate the average, ensuring division is floating-point
        double average = (double) H / P;

        // Print the result with 2 decimal places
        System.out.printf("%.2f%n", average);

        sc.close();
		
	}

}
