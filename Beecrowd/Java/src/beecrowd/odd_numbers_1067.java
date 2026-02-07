package beecrowd;
import java.util.Scanner;

public class odd_numbers_1067 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 0;

        do{
            i++;
            if((i%2) != 0){
                System.out.println(i);
            }
        }while(number != i);

        sc.close();
    }
}