package Beecrowd.Java;
import java.util.Scanner;

public class suma_simple_1003 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int A,B,soma;
        
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();
        soma = A+B;
        System.out.println("SOMA = "+soma);

    }
}
