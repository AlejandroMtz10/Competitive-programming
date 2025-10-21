package beecrowd;
import java.util.Scanner;
public class pum_1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 1;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d PUM\n", count, count + 1, count + 2);
            count += 4;
        }
        sc.close();
    }
}