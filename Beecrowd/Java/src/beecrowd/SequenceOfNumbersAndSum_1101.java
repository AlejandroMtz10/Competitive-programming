import java.io.IOException;
import java.util.Scanner;

public class SequenceOfNumbersAndSum_1101 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
         while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            if (m <= 0 || n <= 0) {
                break;
            }
            
            int start = Math.min(m, n);
            int end = Math.max(m, n);
            int sum = 0;
            
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            
            System.out.println("Sum=" + sum);
        }
        
        sc.close();
 
    }
 
}
