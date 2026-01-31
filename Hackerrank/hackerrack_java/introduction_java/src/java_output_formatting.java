import java.io.IOException;
import java.util.Scanner;

public class java_output_formatting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // formatting logic
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();

    }
}
