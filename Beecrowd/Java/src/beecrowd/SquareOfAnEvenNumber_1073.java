/*
  Problem: Square of an even number
  ID: 1073
*/

import java.io.IOException;
import java.util.Scanner;
public class SquareOfAnEvenNumber_1073 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
		    if(i%2 == 0){
		        result = i * i;
		        System.out.println(i + "^2 = " + result);
		    }
		}
 
    }
 
}
