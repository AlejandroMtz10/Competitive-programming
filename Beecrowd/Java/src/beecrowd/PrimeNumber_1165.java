import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber_1165 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = 0, cases = 0, count = 0;
        
        cases = sc.nextInt();
        
        for(int i = 0; i < cases; i++){
            n = sc.nextInt();
            count = 0;
            
            for(int j = 1; j <= n; j++){
                if(n%j == 0){
                    count++;
                }
            }
            
            if(count == 2){
                System.out.println(n + " eh primo");
            }else{
                System.out.println(n + " nao eh primo");
            }
        }
        
    }
 
}
