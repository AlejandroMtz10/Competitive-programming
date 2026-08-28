import java.io.IOException;
import java.util.Scanner;
 
public class EasyFibonacci_1151 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int t1 = 0, t2 = 1;
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(t1);
            } else if (i == 1) {
                System.out.print(" " + t2);
            } else {
                int next = t1 + t2;
                System.out.print(" " + next);
                t1 = t2;
                t2 = next;
            }
        }
        System.out.println();
    }
}
