/*
  Problem: Going Up and Down
  ID: 1113
*/

import java.io.IOException;
import java.util.Scanner;

public class GoingUpAndDown_1113 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		do{
		    x = sc.nextInt();
		    y = sc.nextInt();
		    
		    if(x > y){
		        System.out.println("Decrescente");
		    }else if(x < y){
		        System.out.println("Crescente");
		    }
		}while(x != y);
		
		sc.close();
 
    }
 
}
