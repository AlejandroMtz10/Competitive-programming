/*
 * Ejercicio de Beecrowd: Notas de Sabor.
 * Número de ejercicio: 2344.
 * Dar calificaciones de E a la A dependiendo de la calidicacion ingresada que va del 0 al 100.
 * 
 * Echo por: Alejandro Martínez Rivera.
 * */
package beecrowd;
import java.util.Scanner;
public class notas_de_sabor_2344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cal = 0;
		
		cal = sc.nextInt();
		
		if(cal == 0) {
			System.out.println("E");
		}else if(cal >= 1 && cal <= 35){
			System.out.println("D");
		}else if(cal >= 36 && cal <= 60){
			System.out.println("C");
		}else if(cal >= 61 && cal <= 85){
			System.out.println("B");
		}else if(cal >= 86 && cal <= 100){
			System.out.println("A");
		}

	}

}
