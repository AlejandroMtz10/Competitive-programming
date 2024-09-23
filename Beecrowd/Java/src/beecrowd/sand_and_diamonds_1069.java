package beecrowd;

import java.util.Scanner;

public class sand_and_diamonds_1069 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		char caracter;
		String cadena;
		
		n = sc.nextInt();
		
		String cadenas [] = new String [n];
		
		for(int i = 0; i < n;i++) {
			cadenas[i] = sc.next();
		}
		
		for(int i = 0;i < cadenas.length; i++) {
			cadena = cadenas[i];
			int diamantes = 0,izquierda=0, derecha=0;
			for(int j = 0; j < cadena.length(); j++) {
				caracter = cadena.charAt(j);
				if (caracter == '<') {
					izquierda++;
				}else if(caracter == '>'){
					derecha++;
				}
				
			}
			if (izquierda == derecha) {
				diamantes = derecha;
				System.out.println(diamantes);
			}else if(izquierda > derecha) {
				diamantes = derecha;
				System.out.println(derecha);
			}else if(derecha > izquierda) {
				System.out.println(izquierda);
			}
		}
		
		

		
	}
}