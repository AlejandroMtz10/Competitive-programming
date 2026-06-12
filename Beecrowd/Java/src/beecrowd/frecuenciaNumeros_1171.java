/*
* Problem: Frecuencia de los numeros, ID problem: 1171
* Platform: Beecrowd, Type: AD-HOC
* Solved by Ing. Alejandro Martínez Rivera - Jun 12th 2026
* In this solution I used an array & a tree map to process the input & it can generate the output
* Java 19
*/
package beecrowd;

import java.util.*;
public class frecuenciaNumeros_1171{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		Map<Integer, Integer>dictionaryNumbers = new TreeMap<>();
		
		for(int i = 0; i <= n-1; i++){
		    numbers[i] = sc.nextInt();
		}
		
		for(int number:numbers){
		    int currentCount = dictionaryNumbers.getOrDefault(number,0);
		    dictionaryNumbers.put(number, currentCount + 1);
		}
		
	    dictionaryNumbers.forEach((number, currentCount) -> 
            System.out.println(number + " aparece " + currentCount + " vez(es)")
      );
	}
}
