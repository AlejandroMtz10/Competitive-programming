package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class toll_2377 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int l = 0, d = 0, k = 0, p = 0, cost = 0;
        
        l = sc.nextInt();
        d = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();
        
        cost = (l * k) + ((l / d) * p);
        
        System.out.println(cost);

        sc.close();

    }
}