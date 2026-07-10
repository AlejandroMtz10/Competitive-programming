/*
  Problem: Types Of Triangles
  ID: 1045
*/

import java.io.IOException;
import java.util.Scanner;

public class TypesOfTriangles_1045 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
		
		float a = 0, b = 0, c = 0, aux = 0;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }
        
        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }
        
        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }
		
		if(a >= (b+c)){
		    System.out.println("NAO FORMA TRIANGULO");
		}else{
		    if((a*a) == ((b*b)+(c*c))){
		        System.out.println("TRIANGULO RETANGULO");
		    }
		    
		    if((a*a) > ((b*b)+(c*c))){
		        System.out.println("TRIANGULO OBTUSANGULO");
		    }
		    
		    if((a*a) < ((b*b)+(c*c))){
		        System.out.println("TRIANGULO ACUTANGULO");
		    }
		    
		    if(a == b && a == c){
		        System.out.println("TRIANGULO EQUILATERO");
		    }else if(a == b || a == c || b == c){
		        System.out.println("TRIANGULO ISOSCELES");
		    }
		    
		}
		
		sc.close();
 
    }
 
}
