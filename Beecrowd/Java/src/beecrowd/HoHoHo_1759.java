import java.io.IOException;
import java.util.Scanner;

public class HoHoHo_1759 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int nHo = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < nHo; i++) {
                if (i != (nHo - 1)) {
                    sb.append("Ho ");
                } else {
                    sb.append("Ho!");
                }
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}
