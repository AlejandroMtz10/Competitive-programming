package beecrowd;
import java.util.Scanner;
public class event_2172 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            long x = sc.nextLong();
            long m = sc.nextLong();

            if (x == 0 && m == 0) {
                break;
            }

            System.out.println(x * m);
        }

        sc.close();

    }
}
