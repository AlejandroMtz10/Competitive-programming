import java.io.IOException;
import java.util.Scanner;

public class VictoriaAndHerIndecision_1924 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            
            String[] carears = new String[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    carears[i] = sc.nextLine();
                }
            }
            
            System.out.println("Ciencia da Computacao");
        }
        sc.close();
    }
}
