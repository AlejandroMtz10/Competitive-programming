/*
*  Problem: Chat International
*  Problem ID: 1581
*  Solution: Accepted in Java 19
*  By Eng. Alejandro Martínez Rivera Jun 16th, 2026
*/
package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class chatInternational_1581 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                sc.nextLine();
                
                String firstLanguage = sc.nextLine().trim();
                boolean everyone = true;
                
                for (int j = 1; j < k; j++) {
                    String otherLanguage = sc.nextLine().trim();
                    if (!otherLanguage.equals(firstLanguage)) {
                        everyone = false;
                    }
                }
                
                if (everyone) {
                    System.out.println(firstLanguage);
                } else {
                    System.out.println("ingles");
                }
            }
        }
        sc.close();
    }
}
