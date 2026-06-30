/*
  Problem: Optical scanner.
  ID: 1129
  Type: AD-HOC
*/
package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class OpticalScanner_1129 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N, i = 0;
        int a, b, c, d, e;
        int black = 0;

        do {
            if (!sc.hasNextInt()) break;
            N = sc.nextInt();
            
            if (N == 0) break;

            for (i = 0; i < N; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                d = sc.nextInt();
                e = sc.nextInt();

                if (a <= 127) { black++; a = 1; } else { a = 0; }
                if (b <= 127) { black++; b = 1; } else { b = 0; }
                if (c <= 127) { black++; c = 1; } else { c = 0; }
                if (d <= 127) { black++; d = 1; } else { d = 0; }
                if (e <= 127) { black++; e = 1; } else { e = 0; }

                if (black == 1) {
                    if (a == 1) { System.out.println("A"); }
                    if (b == 1) { System.out.println("B"); }
                    if (c == 1) { System.out.println("C"); }
                    if (d == 1) { System.out.println("D"); }
                    if (e == 1) { System.out.println("E"); }
                } else {
                    System.out.println("*");
                }
                black = 0;
            }

        } while (N != 0);

        sc.close();
 
    }
 
}
