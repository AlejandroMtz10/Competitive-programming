/*
  Problem: Multiplication tables
  ID: 1078
*/

import java.io.IOException;
import java.util.Scanner;

public class MultiplicationTables_1078 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; i++){
		    int result = i*n;
		    
		    System.out.println(i + " x " + n + " = " + result);
		}
		
		sc.close();
 
    }
 
}
