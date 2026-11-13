import java.io.IOException;
import java.util.Scanner;

public class FibonacciArray_1176 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[] cases = new int[t];
        
        for (int i = 0; i < t; i++) {
            cases[i] = sc.nextInt();
        }
        
        for (int i = 0; i < t; i++) {
            long fibonacci = 0, next = 1, aux = 0;
            int count = 0;
            
            while (count < cases[i]) {
                aux = fibonacci + next;
                fibonacci = next;
                next = aux;
                count++;
            }
            
            System.out.println("Fib(" + cases[i] + ") = " + fibonacci);
        }
        
        sc.close();
    }
}
