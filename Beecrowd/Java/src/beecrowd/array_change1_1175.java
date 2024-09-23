package beecrowd;
	import java.util.Scanner;
public class array_change1_1175 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] N = new int[20];
	        
	        // Read the array
	        for (int i = 0; i < 20; i++) {
	            N[i] = scanner.nextInt();
	        }
	        
	        // Perform the swapping
	        for (int i = 0; i < 10; i++) {
	            int temp = N[i];
	            N[i] = N[19 - i];
	            N[19 - i] = temp;
	        }
	        
	        // Print the modified array
	        for (int i = 0; i < 20; i++) {
	            System.out.println("N[" + i + "] = " + N[i]);
	        }
	        
	        scanner.close();
	    }
}