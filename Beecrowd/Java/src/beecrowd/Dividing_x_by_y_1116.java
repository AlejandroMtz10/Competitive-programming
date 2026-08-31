import java.io.IOException;
import java.util.Scanner;

public class Dividing_x_by_y_1116 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        float x = 0, y = 0;
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            
            x = sc.nextFloat();
            y = sc.nextFloat();
            
            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", x/y);
            }
            
        }
 
    }
 
}
