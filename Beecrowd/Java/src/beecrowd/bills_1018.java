package beecrowd;

import java.util.Scanner;

public class bills_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int bills = sc.nextInt();
        int current = bills;
        int bills100 = current / 100;
        current -= bills100 * 100;
        int bills50 = current / 50;
        current -= bills50 * 50;
        int bills20 = current / 20;
        current -= bills20 * 20;
        int bills10 = current / 10;
        current -= bills10 * 10;
        int bills5 = current / 5;
        current -= bills5 * 5;
        int bills2 = current / 2;
        current -= bills2 * 2;
        int bills1 = current;

        
        System.out.println(bills);
        System.out.println(bills100 + " nota(s) de R$ 100,00");
        System.out.println(bills50 + " nota(s) de R$ 50,00");
        System.out.println(bills20 + " nota(s) de R$ 20,00");
        System.out.println(bills10 + " nota(s) de R$ 10,00");
        System.out.println(bills5 + " nota(s) de R$ 5,00");
        System.out.println(bills2 + " nota(s) de R$ 2,00");
        System.out.println(bills1 + " nota(s) de R$ 1,00");
			
	}

}
