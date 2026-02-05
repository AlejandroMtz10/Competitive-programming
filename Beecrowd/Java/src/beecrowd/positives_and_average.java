package beecrowd;
import java.util.Scanner;
public class positives_and_average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float[] numbers = new float[6];
        int positives = 0;
        float aux_positives = 0;

        for(int i = 0; i < 6; i++){

            numbers[i] = sc.nextFloat();

            if(numbers[i] > 0){

                positives+=1;

                aux_positives = aux_positives + numbers[i];

            }

        }
        
        aux_positives = aux_positives / positives;

        System.out.println(positives + " valores positivos");
        System.out.printf("%.1f%n", aux_positives);

        sc.close();
    }
}
