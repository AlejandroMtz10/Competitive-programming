

import java.io.IOException;
import java.util.Scanner;

public class ArrayFill2_1177 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[1000];
        
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i < 1000; i++){
            
            if(count == n){
                count = 0;
            }
            
            System.out.println("N[" + i + "] = " + count);
            
            if(count < n){
                count++;
            }
            
        }
    }
 
}
