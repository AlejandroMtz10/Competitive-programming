package leetCode_solutions;
import java.util.*;
public class palindromeNumber_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        palindromeNumber_9 solution = new palindromeNumber_9();
        int testNumber = sc.nextInt();

        if (solution.isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
	
	//This function is the solution on LeetCode
	public boolean isPalindrome(int number) {
    	if (number < 0)
    	      return false;

    	    long reversed = 0;
    	    int aux = number;

    	    while (aux > 0) {
    	      reversed = reversed * 10 + aux % 10;
    	      aux /= 10;
    	      	}
    	    return reversed == number;
    }
	
	
}
