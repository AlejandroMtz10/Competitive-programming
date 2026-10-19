import java.io.IOException;
import java.util.Scanner;

public class NextOdd_3250 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n%2 == 0){
            n = n + 1;
        }else{
            n = n + 2;
        }
        
        System.out.println(n);
        
        sc.close();
 
    }
 
}
