package beecrowd;

import java.util.Scanner;

public class area_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a, b, c, triangle, circle, trapeze, square, rectangle;
		double pi;
		
		pi = 3.14159;
		
		a = sc.nextFloat();
		
		b = sc.nextFloat();
		
		c = sc.nextFloat();
		
		// Triangle rectangle area
		// A is a base and C is a height
		
		triangle = (a * c)/2;
		
		// Circle area
		// C is a radio
		
		circle = (float) ((c * c) * pi);
		
		// Trapeze area
		// A and B bases and C is a height
		
		trapeze = ((a + b) * c) / 2;
		
		// Square area
		// B is a side
		
		square = (b * b);
		
		// rectangle area
		// A and B are sides
		
		rectangle = a * b;
		
		System.out.println("TRIANGULO: " +String.format("%.3f", triangle));
		System.out.println("CIRCULO: " + String.format("%.3f", circle));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
		System.out.println("QUADRADO: " + String.format("%.3f", square));
		System.out.println("RETANGULO: " + String.format("%.3f", rectangle));
		
	}

}
