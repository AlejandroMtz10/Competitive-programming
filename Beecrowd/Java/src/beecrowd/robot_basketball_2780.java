/*
 * Solution by Eng. Alejandro Martinez
 */
package beecrowd;
import java.util.Scanner;
public class robot_basketball_2780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;

        d = sc.nextInt();

        if(d >= 0 && d <= 800){
            System.out.println(1);
        } else if (d <= 1400) {
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}