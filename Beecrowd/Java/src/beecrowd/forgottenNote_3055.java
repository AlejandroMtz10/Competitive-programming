/*
* Problem: Forgotten Note ID: 3055
* Solution: Java 19
* By Eng. Alejandro Martínez Rivera
*/

import java.io.IOException;
import java.util.Scanner;
public class forgottenNote_3055 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a = 0, b = 0, m = 0;
        
        a = sc.nextInt();
        m = sc.nextInt();
        
        b = (2 * m) - a;
        
        System.out.println(b);
        
        sc.close();
 
    }
 
}
