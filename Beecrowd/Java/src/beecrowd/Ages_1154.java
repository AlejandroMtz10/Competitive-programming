import java.io.IOException;
import java.util.Scanner;
 
public class Ages_1154{
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int i = 0, count = 0, ageInput = 0;
        double avgAge = 0;
        
        while(ageInput >= 0){
            ageInput = sc.nextInt();
            
            if(ageInput > 0){
                count+=ageInput;
                i++; 
                
            }
            
        }
        
        
        avgAge = (double) count / i;

        System.out.printf("%.2f\n", avgAge);
 
        sc.close();
    }
 
}
