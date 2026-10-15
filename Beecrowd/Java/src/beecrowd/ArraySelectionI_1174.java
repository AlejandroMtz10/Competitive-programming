import java.io.IOException;
import java.util.Scanner;
public class ArraySelectionI_1174  {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double array[] = new double[100];
        
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextDouble();
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[i] <= 10){
                System.out.println("A[" + i + "] = " + array[i]);
            }
        }
        
    }
}
