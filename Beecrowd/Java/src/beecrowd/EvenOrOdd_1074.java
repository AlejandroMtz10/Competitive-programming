/*
  Problem: Even or odd
  ID: 1074
*/

package beecrowd;

import java.io.IOException;
import java.util.Scanner;
public class EvenOrOdd_1074 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int nCases = 0, number = 0;
		
		nCases = sc.nextInt();
		
		for(int i = 0; i < nCases; i++){
		    number = sc.nextInt();
		    
		    if(number == 0){
		        System.out.println("NULL");
		    }else if(number > 0){
		        if(number%2 == 0){
		            System.out.println("EVEN POSITIVE");  
		        }else{
		            System.out.println("ODD POSITIVE");  
		        }
		    }else{
		        if(number%2 == 0){
		            System.out.println("EVEN NEGATIVE");  
		        }else{
		            System.out.println("ODD NEGATIVE");  
		        }
		    }
		}
		
		sc.close();
 
    }
 
}
