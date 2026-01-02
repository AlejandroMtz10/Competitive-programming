package beecrowd;
import java.util.Scanner;
public class even_odd_positive_and_negative_1066 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int [5];
        int even = 0, odd = 0, positive = 0, negative = 0;

        for(int i = 0; i < 5; i++){
            numbers[i] =  sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            if(numbers[i] != 0){
                if(numbers[i] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }

                if (numbers[i] > 0){
                    positive++;
                }else if(numbers[i] < 0){
                    negative++;
                }
            }else{
                // In case the number is 0
                even++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

    }
}
