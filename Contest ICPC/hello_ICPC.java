/*
 	Problem: ICPC
 	Year: 2023
 	Autor: Alejandro Martinez Rivera
 	Duplicate the letter "e"
 * */
import java.util.Scanner;

public class hello_ICPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Read the word
        String word = sc.next();
        
        // Create the constructor word
        StringBuilder newWord = new StringBuilder();
        
        // Bucle for-each to traverse the word
        for (char character : word.toCharArray()) {
            if (character == 'e') {
                // If the character is 'e', ​​add twice to the new string
                newWord.append("ee");
            } else {
                // If not 'e', ​​add the character as is
                newWord.append(character);
            }
        }
        
        // Print the new string
        System.out.println(newWord.toString());
        
        sc.close();

	}

}
