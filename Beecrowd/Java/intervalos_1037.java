/*
Ejercicio de beewcrowd para calcular el intervalo de un nuemero
Realizado por: Alejandro Martínez Rivera 4 de marzo 2023
 */
package Beecrowd.Java;

import java.util.Scanner;

public class intervalos_1037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
		float n;
		
		n = sc.nextFloat();
		sc.close();
		if (n >= 0 && n <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if (n >= 25 && n <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if (n >= 50 && n <= 75) {
			System.out.println("Intervalo (50,75]");
		}else if (n >= 75 && n <= 100) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
    }
}