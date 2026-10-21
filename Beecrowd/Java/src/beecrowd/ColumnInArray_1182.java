import java.io.IOException;
import java.util.Scanner;

public class ColumnInArray_1182 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double matrix[][] = new double [12][12]; 
        int column = 0;
        char op;
        double result = 0;
        
        column = sc.nextInt();
        op = sc.next().charAt(0); 
        
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matrix[i][j] = sc.nextDouble(); 
            }
        }
        
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                if(j == column){ 
                    result += matrix[i][j];
                }
            }
        }
        
        if(op == 'S'){
            System.out.printf("%.1f\n", result);
        } else if(op == 'M'){
            result /= 12;
            System.out.printf("%.1f\n", result);
        }
        
        sc.close();
    }
}
