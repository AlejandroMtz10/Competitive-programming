import java.io.IOException;
import java.util.Scanner;

public class PopulationIncrease_1160 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int nCases = 0;
        
        nCases = sc.nextInt();
        
        for(int i = 0; i < nCases; i++){
            int pa = 0, pb = 0, years = 0;
            double g1 = 0, g2 = 0;
            pa = sc.nextInt();
            pb = sc.nextInt();
            g1 = sc.nextDouble();
            g2 = sc.nextDouble();
            
            while (pa <= pb) {
                pa += (int) (pa * (g1 / 100.0));
                pb += (int) (pb * (g2 / 100.0));
                
                years++;
                
                if (years > 100) {
                    break;
                }
            }
            
            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }

        }
        sc.close();
    }
}
