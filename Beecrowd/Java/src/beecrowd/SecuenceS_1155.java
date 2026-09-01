import java.io.IOException;

public class SecuenceS_1155 {
 
    public static void main(String[] args) throws IOException {
 
        double s = 1.0;
        
        for(double i = 2.0; i <= 100; i++){
            s = s + (1.0/i);
        }
        
        
        System.out.printf("%.2f\n", s);
        
    }
 
}
