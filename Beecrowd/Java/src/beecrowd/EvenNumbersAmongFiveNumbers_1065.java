/*
  Problem: Even Numbers Among Five Numbers
  ID: 1065
*/

import java.io.IOException;
import java.util.Scanner;

public class EvenNumbersAmongFiveNumbers_1065 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int n = 0, count = 0;
		
		for(int i = 0; i < 5; i++){
		    n = sc.nextInt();
		    
		    if(n%2 == 0){
		        count++;
		    }
		}
		
		sc.close();
		
		System.out.println(count + " valores pares");
 
    }
 
}
