/*
 Problem: Diferencia.
 Number 1007
 Author: Alejandro Martinez Rivera
 Date: 09/02th/2024
 */

package beecrowd;

import java.util.Scanner;

public class diferencia_1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferencia;
		
		//Read the data
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferencia = (a*b)-(c*d);
		
		System.out.println("DIFERENCIA = "+diferencia);
		
		
	}

}
