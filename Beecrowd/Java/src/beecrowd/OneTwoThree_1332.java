import java.io.IOException;
import java.util.Scanner;

public class OneTwoThree_1332 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        
        String regexOne = "(..e|o.e|on.)";

        for (int i = 0; i < n; i++) {
            String palabra = sc.nextLine().trim();
            
            if (palabra.length() == 5) {
                System.out.println(3);
            } 
            else if (palabra.matches(regexOne)) {
                System.out.println(1);
            } 
            else {
                System.out.println(2);
            }
        }
        
        sc.close();
 
    }
 
}
