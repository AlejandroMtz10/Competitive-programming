import java.io.IOException;
import java.util.Scanner;

public class FillingArray_III_1178 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        double []array = new double[100];
        array[0] = n;
        
        for(int i = 1; i < 100; i++){
            double y = array[i-1] / 2;
            
            array[i] = y;
        }
        
        
        for(int i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f%n", i, array[i]);
        }
        
        sc.close();
    }
 
}
