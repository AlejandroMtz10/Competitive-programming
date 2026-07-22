import java.io.IOException;
import java.util.Scanner;

public class LeftReturn_1437 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            String comands = sc.next();
            
            int position = 0;
            
            for (int i = 0; i < n; i++) {
                char c = comands.charAt(i);
                if (c == 'D') {
                    position++;
                } else if (c == 'E') {
                    position--;
                }
            }
            
            position = position % 4;
            if (position < 0) {
                position += 4;
            }
            
            if (position == 0) {
                System.out.println("N");
            } else if (position == 1) {
                System.out.println("L");
            } else if (position == 2) {
                System.out.println("S");
            } else if (position == 3) {
                System.out.println("O");
            }
        }
        
        sc.close();
    }
}
