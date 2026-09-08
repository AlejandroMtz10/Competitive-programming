import java.io.IOException;
import java.util.Scanner;

public class ArrayFill1_1173 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[10];
        
        int initial = sc.nextInt();
        
        for(int i = 0; i <= 9; i++){
            if(i == 0){
                array[i] = initial;
            }else{
                array[i] = array[i-1] * 2;
            }
            
            System.out.println("N["+ i +"] = " + array[i]);
        }
        
 
    }
 
}
