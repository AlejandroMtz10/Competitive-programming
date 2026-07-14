/*
  Problem: Residue 2
  ID: 1075
*/
package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Residue2_1075 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < 10000; i++){
		    if(i%n == 2){
		        System.out.println(i);
		    }
		}
		
		sc.close();
 
    }
 
}
