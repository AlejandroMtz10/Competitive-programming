package beecrowd;

import java.util.Scanner;

public class macPronalts_1985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n, b;
        float a, s = 0.0f;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a = sc.nextFloat();
            b = sc.nextInt();

            if (a == 1001) {
                a = 1.50f;
            } else if (a == 1002) {
                a = 2.50f;
            } else if (a == 1003) {
                a = 3.50f;
            } else if (a == 1004) {
                a = 4.50f;
            } else if (a == 1005) {
                a = 5.50f;
            }
            s = s + a * b;
        }
        System.out.printf("%.2f%n", s);
        sc.close();
	}

}