import java.io.IOException;
import java.util.Scanner;

public class PerfectNumber_1164 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int nCases = 0, num = 0, sum = 0;
        
        nCases = sc.nextInt();
        
        for(int i = 0; i < nCases; i++){
            num = sc.nextInt();
            
            for(int j = 1; j < num; j++){
                if(num%j == 0 && j != num){
                    sum+=j;
                }
            }
            
            if(sum == num){
                System.out.println(num + " eh perfeito");
            }else{
                System.out.println(num + " nao eh perfeito");
            }
            sum = 0;
        }
 
    }
}
