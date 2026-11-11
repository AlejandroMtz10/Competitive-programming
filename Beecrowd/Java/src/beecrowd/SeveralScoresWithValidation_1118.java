import java.io.IOException;
import java.util.Scanner;

public class SeveralScoresWithValidation_1118 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, avg = 0;
        int x = 0;
        
        while(x != 2){
            
            do{
                a = sc.nextDouble();
                if(a < 0 || a > 10){
                   System.out.println("nota invalida"); 
                }
            }while(a < 0 || a > 10);
            
            do{
                b = sc.nextDouble();
                if(b < 0 || b > 10){
                   System.out.println("nota invalida"); 
                }
            }while(b < 0 || b > 10);
            
            avg = (a + b) / 2;
            System.out.printf("media = %.2f\n", avg);
            
            do{
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
                if(x == 2){
                    break;
                }
            }while(x < 0 || x > 2);
            
        }
        
        sc.close();
 
    }
 
}
