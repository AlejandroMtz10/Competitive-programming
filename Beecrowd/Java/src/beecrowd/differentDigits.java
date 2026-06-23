/*
  Problem: Different Digits.
  ID: 1285
  By Eng. Alejandro Martínez Rivera
*/


import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class differentDigits {
 
    public static void main(String[] args) throws IOException {
 
	    Scanner sc = new Scanner(System.in);
	    
        // The loop processes the numbers as long as it receives input
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int count = 0; 
            
            for(int i = n; i <= m; i++){
                // Parse the number i to nText
                String nText = Integer.toString(i);
                Set<Character> checked = new HashSet<>();
                boolean duplicated = false;
                
                for (int j = 0; j < nText.length(); j++) {
                    char digit = nText.charAt(j);
                    // Break the loop when a digit is duplicated in the number
                    if (!checked.add(digit)) {
                        duplicated = true;
                        break;
                    }
                }
                
                if(!duplicated){
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
