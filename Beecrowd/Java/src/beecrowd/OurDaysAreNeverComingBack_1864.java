import java.io.IOException;
import java.util.Scanner;

public class OurDaysAreNeverComingBack_1864 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String phrase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = sc.nextInt();
        

        String subphrase = phrase.substring(0, n);
        System.out.println(subphrase);
      
        sc.close();
      
    } 
}
