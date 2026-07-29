package beecrowd;

import java.io.IOException;
import java.util.Scanner;
public class SumOfConsecutiveOddNumbersII_1099 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i =0; i<n; i++){
            int x, y, aux, sum = 0;
            
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x > y){
                aux = x;
                x = y;
                y = aux;
            }
            
            for(int j = x+1;j<y;j++){
                if(j%2 !=0){
                    sum+=j;
                }
            }
            
            System.out.println(sum);
        }
        
        sc.close();
 
    }
 
}
