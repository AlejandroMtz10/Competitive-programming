import java.io.IOException;
import java.util.Scanner;
public class Experiments_1094 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
 
        int nCases = 0, rabbits = 0, rats = 0, toads = 0, n = 0, animals = 0;
        char animal;
        double pRabbits = 0, pRats = 0, pToads = 0;
        
        nCases = sc.nextInt();
        
        for(int i = 0; i < nCases; i++){
            n = sc.nextInt();
            animal = sc.next().charAt(0);
            
            switch(animal){
                case 'C':
                    rabbits+=n;
                    break;
                case 'R':
                    rats+=n;
                    break;
                case 'S':
                    toads+=n;
                    break;
                default:
                    i--;
                    break;
            }
        }
        
        animals = rabbits + rats + toads;
        pRabbits = ((double) rabbits / animals) * 100;
        pRats = ((double) rats / animals) * 100;
        pToads = ((double) toads / animals) * 100;
        
        System.out.println("Total: " + animals + " cobaias");
        System.out.println("Total de coelhos: " + rabbits);
        System.out.println("Total de ratos: " + rats);
        System.out.println("Total de sapos: " + toads);
        System.out.printf("Percentual de coelhos: %.2f %%\n", pRabbits);
        System.out.printf("Percentual de ratos: %.2f %%\n", pRats);
        System.out.printf("Percentual de sapos: %.2f %%\n", pToads);

    }
 
}
