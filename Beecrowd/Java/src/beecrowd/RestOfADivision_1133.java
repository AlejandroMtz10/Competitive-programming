import java.io.IOException;
import java.util.Scanner;

public class RestOfADivision_1133 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 0, y = 0;
        
        x = sc.nextInt();
        
        y = sc.nextInt();
        
        
        if(x > y){
            int aux = x;
            x = y;
            y = aux;
        }
        
        for(int i = x+1; i < y; i++){
            if(i%5 == 2 || i%5 == 3){
                System.out.println(i);
            }
        }
 
    }
 
}
