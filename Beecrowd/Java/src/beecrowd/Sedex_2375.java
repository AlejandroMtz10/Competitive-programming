/*
  Problem: Sedex
  ID: 2375
*/
package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Sedex_2375 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int diameter = 0, height = 0, width = 0, depth = 0;
        
        diameter = sc.nextInt();
        height = sc.nextInt();
        width = sc.nextInt();
        depth = sc.nextInt();
        
        if((diameter <= height) && (diameter <= width) && (diameter <= depth)){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
        
        sc.close();
    }
 
}
