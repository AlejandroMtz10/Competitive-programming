import java.io.IOException;
import java.util.Scanner;

public class WeightedAverages_1079 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        double a = 0, b = 0, c = 0, avg = 0;
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            
            a = a * 0.2;
            b = b * 0.3;
            c = c * 0.5;
            
            avg = a + b + c;
            
            System.out.println(String.format("%.1f", avg)); // Control the output
        }
 
    }
 
}
