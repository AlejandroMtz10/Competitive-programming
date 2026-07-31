package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SummingConsecutiveIntegers_1149 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int n = 0, a = 0, sum = 0;
        
        a = sc.nextInt();
        
        do{
            n = sc.nextInt();
        }while(n <= 0);
        
        for(int i = 0; i <= n-1; i++){
            int aux = a + i;
            sum+=aux;
        }
        
        System.out.println(sum);
        
        sc.close();
        
    }
}
