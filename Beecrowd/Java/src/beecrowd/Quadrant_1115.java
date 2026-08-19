import java.io.IOException;
import java.util.Scanner;

public class Quadrant_1115 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 0, y = 0;
        
        
        do {
            
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x > 0){
                if(y > 0){
                    System.out.println("primeiro");
                }else if(y < 0){
                    System.out.println("quarto");
                }
            }else if(x < 0){
                if(y > 0){
                    System.out.println("segundo");
                }else if(y < 0){
                    System.out.println("terceiro");
                }
            }
            
            
        }while(x != 0 && y != 0);
 
    }
 
}
