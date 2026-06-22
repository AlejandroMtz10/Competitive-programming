/*
Problem: Six Odd Numbers
ID: 1070

Description
Read an integer X and print the 6 consecutive odd numbers starting from X, one number per line, including X if applicable.

Input
The input will be a positive integer.

Output
The output will consist of six consecutive odd numbers.

Example
Input: 	8
Output: 9, 11, 13, 15, 17, 19

By Eng.Alejandro Martínez Rivera
*/

import java.io.IOException;
import java.util.Scanner;

public class sixOddNumbers {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        
        x = sc.nextInt();
        
       if (x % 2 == 0) {
            x++;
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }
        
    }
 
}
