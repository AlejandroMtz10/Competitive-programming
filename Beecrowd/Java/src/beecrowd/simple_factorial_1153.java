package beecrowd;

import java.util.Scanner;

public class simple_factorial_1153 {
	
	 public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	    
	    int  number;
	    
	    number = sc.nextInt();
	    
	    factorial(number);
	    
	    System.out.println(n);
		
	}
	
	public static int factorial(int number){
	    int i, fact = 1;
	    for(i = 1; i <= number; i++){
	        fact = fact * i;
	    }
	    n = fact;
	    return n;
	}

}
