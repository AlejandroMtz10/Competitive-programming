/*
  Problem: Sum of Consecutive Odd Numbers 1
  ID: 1071
  URL: https://judge.beecrowd.com/es/problems/view/1071
*/
import java.io.IOException;
import java.util.Scanner;
public class SumConscutiveOddNumbers1_1071 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 0, y = 0, sum = 0;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        

        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
 
    }
 
}
