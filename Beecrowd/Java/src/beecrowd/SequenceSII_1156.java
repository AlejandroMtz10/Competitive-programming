import java.io.IOException;

public class SequenceSII_1156 {
 
    public static void main(String[] args) throws IOException {
 
        double s = 1;
        double n2 = 2;
        
        for (double n1 = 3; n1 <= 39; n1 += 2) {
            s += n1 / n2;
            n2 *= 2;
        }
        
        System.out.printf("%.2f\n",s);
 
    }
 
}
