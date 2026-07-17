/*
  Problem: Highest and position
  ID: 1080
*/

import java.io.IOException;
import java.util.Scanner;

public class HighestAndPosition_1080 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        
        int[] numbers = new int [100];
        int higher = numbers[0];
        int position = 0;
        
        for(int i = 0; i<100; i++){
            numbers[i] = sc.nextInt();
            
            if(numbers[i] > higher){
                higher =  numbers[i];
                position = i + 1;
            }
        }
        
        sc.close();
        
        System.out.println(higher);
        System.out.println(position);
    }
 
}
