package beecrowd;
import java.util.Scanner;
public class og_1387 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l = 0, r = 0;

        do{
            l = sc.nextInt();
            r = sc.nextInt();

            if(l != 0 && r != 0){
                System.out.println(l+r);
            }

        }while(l != 0 && r != 0);
    }
}
