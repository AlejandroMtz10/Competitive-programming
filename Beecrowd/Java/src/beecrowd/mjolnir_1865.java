package beecrowd;

import java.io.IOException;
import java.util.Scanner;
public class mjolnir_1865 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            String x = sc.next();
            int n = sc.nextInt();

            if (x.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}