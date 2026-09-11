import java.io.IOException;
import java.util.Scanner;

public class Feynman_1323 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        do{
            n = sc.nextInt();
            int count = 0;
            
            if(n == 0){
                break;
            }else{
                for(int i = 1; i<=n;i++){
                    int aux = i * i;
                    count = count + aux;
                }
                System.out.println(count);
            }
            
        }while(n != 0);
 
    }
 
}
