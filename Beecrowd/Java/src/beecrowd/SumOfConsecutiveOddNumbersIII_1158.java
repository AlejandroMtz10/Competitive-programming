import java.io.IOException;
import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII_1158 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        
        for(int i = 0; i < nCases; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0, aux = 0;
            
            if(x%2 != 0){
                aux = x;
            }else{
                aux = x + 1;
            }
            
            for(int j = 0; j < y; j++){
                count += aux;
                aux += 2;
            }
            
            System.out.println(count);
        }
        
 
    }
 
}
