import java.io.IOException;
import java.util.Scanner;

public class Blobs_1170 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        int days = 0;
        double food = 0;
        
        for(int i = 0; i < nCases; i++){
            food = sc.nextDouble();
            
            while(food > 0.5){
                food = food / 2;
                if(food > 0.5){
                    days++;
                }
            }
            
            System.out.println(days + " dias");
            days = 0;
            food = 0;
        }
        
        sc.close();
 
    }
}
