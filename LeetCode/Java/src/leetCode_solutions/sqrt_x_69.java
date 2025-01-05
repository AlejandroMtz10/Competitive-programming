package leetCode_solutions;

import java.util.Scanner;

public class sqrt_x_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sqrt_x_69 sqrt = new sqrt_x_69();
		//x is to read the number
		int x = 0;
		
		x = sc.nextInt();
		
		x = sqrt.mySqrt(x);
		
		System.out.println(x);
		
	}
	
	public int mySqrt(int x) {
		int result = (int) Math.sqrt(x);
		
        return result;
    }

}
