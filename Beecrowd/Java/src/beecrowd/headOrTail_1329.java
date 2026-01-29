package beecrowd;
import java.util.Scanner;
public class headOrTail_1329 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n == 0) break;

            int mary = 0, john = 0;

            for (int i = 0; i < n; i++) {
                int j = sc.nextInt();
                if (j == 0) {
                    mary++;
                } else if (j == 1) {
                    john++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times\n", mary, john);
        }
        sc.close();

    }

}
