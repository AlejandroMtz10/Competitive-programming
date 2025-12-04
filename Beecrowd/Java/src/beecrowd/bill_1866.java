package beecrowd;
import java.util.Scanner;
public class bill_1866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        c = sc.nextInt();

        int[] casesTest = new int [c];

        for(int i = 0; i <= c - 1; i++){
            casesTest[i] = sc.nextInt();

            if(casesTest[i] % 2 == 0){
                casesTest[i] = 0;
            }else{
                casesTest[i] = 1;
            }
        }

        for(int i = 0; i <= casesTest.length - 1; i++){
            System.out.println(casesTest[i]);
        }
    }
}
