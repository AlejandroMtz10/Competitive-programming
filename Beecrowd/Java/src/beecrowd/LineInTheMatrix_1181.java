import java.io.IOException;
import java.util.Scanner;

public class LineInTheMatrix_1181 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double [][]matrix = new double[12][12];
        String operation = "";
        int line = 0;
        double result = 0;
        
        line = sc.nextInt();
        operation = sc.next().trim();
        
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matrix[i][j] = sc.nextDouble();
            }
        }

        for(int j = 0; j < 12; j++){
            result += matrix[line][j];
        }
        
        if(operation.equals("S")){
            System.out.printf("%.1f%n", result);
        } else if(operation.equals("M")){
            result = result / 12;
            System.out.printf("%.1f%n", result);
        }
        
        sc.close();
    }
}
