package beecrowd;

import java.io.IOException;
import java.util.*;

public class binary_hexadecimal_numbers_systems_3488 {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        boolean status = false;
        double result = 0;
        
        n = sc.nextInt();
        
        if(n >= 1){
            int i = 0;
            
            while(status == false && result < n){
                result = Math.pow(2,i);
                
                if(n == result){
                    status = true;
                }
                i++;
            }
        }
        
        sc.close();
        
        System.out.println(status);
        
    }
 
}