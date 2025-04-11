package beecrowd;
import java.util.Scanner;
public class snack_1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int code, quantity;
        double total = 0;

        // Input reading
        code = sc.nextInt();
        quantity = sc.nextInt();

        // Price calculation based on product code
        if (code == 1) {
            total = quantity * 4.0;
        }
        if (code == 2) {
            total = quantity * 4.5;
        }
        if (code == 3) {
            total = quantity * 5.0;
        }
        if (code == 4) {
            total = quantity * 2.0;
        }
        if (code == 5) {
            total = quantity * 1.5;
        }

        // Output the total amount
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
	}

}
