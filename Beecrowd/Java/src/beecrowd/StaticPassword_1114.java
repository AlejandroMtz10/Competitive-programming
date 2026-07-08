/*
  Problem: Static Password
  ID: 1114
*/
package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class StaticPassword_1114 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int password = 0;
		
		while(password != 2002){
		    password = sc.nextInt();
		    
		    if(password != 2002){
		        System.out.println("Senha Invalida");
		    }
		}
		
		System.out.println("Acesso Permitido");
 
    }
 
}
