import java.io.IOException;
import java.util.Scanner;

public class GradeValidation_1117 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        float a = 0, b = 0, aux = 0, i = 0;
        
        do{
            aux = sc.nextFloat();
            
            if(aux < 0 || aux > 10){
                System.out.println("nota invalida");
            }else{
                if(i == 0){
                    a = aux;
                }else if(i == 1){
                    b = aux;
                }
                i++;
            }

        }while(i < 2);
        
        aux = (a + b) / 2;
        
        System.out.println("media = " + aux);
        
    }
 
}
