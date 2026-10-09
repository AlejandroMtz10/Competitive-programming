import java.io.IOException;
import java.util.Scanner;

public class ExceedingZ_1150 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 0, z = 0, count = 0, sum = 0, i = 0;
        
        x = sc.nextInt();
        
        while(x >= z){
            z = sc.nextInt();
        }
        
        i = x;
        
        while(sum<= z){
            sum+=i;
            count++;
            i++;
        }
        
        System.out.println(count);
        
        sc.close();
 
    }
}
