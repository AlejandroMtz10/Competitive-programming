package beecrowd;
import java.util.Scanner;
public class factorial_sum_1161 {

    public static void main(String[] args) {

        long[] F = new long[21];
        F[0] = 1L;

        for (int i = 1; i <= 20; i++) {
            F[i] = F[i - 1] * i;
        }

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(F[M] + F[N]);
        }

        sc.close();

    }
}
