import java.io.IOException;
import java.util.Scanner;

public class ArrayFillIV_1179 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = 0, countEven = 0, countOdd = 0;
        int[] even = new int[5];
        int[] odd = new int[5];
        
        for (int i = 0; i < 15; i++) {
            n = sc.nextInt();
            
            if (n % 2 == 0) {
                even[countEven] = n;
                countEven++;
                
                if (countEven == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + even[j]);
                    }
                    countEven = 0;
                }
            } else {
                odd[countOdd] = n;
                countOdd++;
                
                if (countOdd == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + odd[j]);
                    }
                    countOdd = 0;
                }
            }
        }
        
        for (int j = 0; j < countOdd; j++) {
            System.out.println("impar[" + j + "] = " + odd[j]);
        }
        
        for (int j = 0; j < countEven; j++) {
            System.out.println("par[" + j + "] = " + even[j]);
        }
        
        sc.close();
    }
}
