import java.io.IOException;
import java.util.Scanner;

public class LowestNumberAndPosition_1180 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        
        int min = array[0];
        int position = 0;
        
        for (int i = 0; i < n; i++) {
            if(array[i] < min){
                min = array[i];
                position = i;
            }
        }
        
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + position);
        
        sc.close();
    }
}
