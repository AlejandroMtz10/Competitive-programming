import java.io.IOException;
import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers_1159 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int x = sc.nextInt();
            
            if (x == 0) {
                break; 
            }
            
            if (x % 2 != 0) {
                x++;
            }
            
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += x;
                x += 2;
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}
