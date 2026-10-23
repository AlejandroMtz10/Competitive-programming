import java.io.IOException;
import java.util.Scanner;

public class FitOrDontFitI_1240 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for(int i = 0; i < nCases; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int digitsB = String.valueOf(b).length();
            
             long divider = (long) Math.pow(10, digitsB);

            boolean endNum = (a % divider) == b;
    
            if(!endNum){
                System.out.println("nao encaixa");
            }else{
                System.out.println("encaixa");
            }
        }
        
        sc.close();
    }
 
}
