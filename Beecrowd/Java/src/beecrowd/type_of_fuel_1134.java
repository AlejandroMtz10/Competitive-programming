package beecrowd;

import java.util.Scanner;

public class type_of_fuel_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gas = 0, alcohol = 0, diesel = 0, gasoline =0;

        do{
            gas = sc.nextInt();
            switch (gas){
                case 1:
                    alcohol++;
                    break;
                case 2:
                    gasoline++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(gas != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}