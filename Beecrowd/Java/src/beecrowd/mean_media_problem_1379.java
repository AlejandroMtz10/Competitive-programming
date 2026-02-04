package beecrowd;
import java.util.Scanner;
public class mean_media_problem_1379 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Exit a=0 b=0
            if (a == 0 && b == 0) {
                break;
            }

            // Order a y b
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            // Result: a - (b-a)
            System.out.println(a - (b - a));
        }
        sc.close();
    }
}
