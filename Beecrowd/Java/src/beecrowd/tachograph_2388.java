package beecrowd;

import java.util.Scanner;

public class tachograph_2388 {
	
    public static void main(String[] args) {
    	 
        Scanner scanner = new Scanner(System.in);

        int n, a, b;
        int cont = 0;
        int distance = 0;

        // Read n
        n = scanner.nextInt();

        while (cont < n) {
            // Read 'a' and 'b'
            a = scanner.nextInt();
            b = scanner.nextInt();
            
            // distance
            distance += a * b;
            cont++;
        }

        // Print the distance
        System.out.println(distance);

        scanner.close();
    }
	
}
