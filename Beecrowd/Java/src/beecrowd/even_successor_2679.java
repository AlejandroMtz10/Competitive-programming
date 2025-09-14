package beecrowd;
import java.util.Scanner;
public class even_successor_2679 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  x = 0;

        x = sc.nextInt();

        if(x % 2 != 0){
            x = x + 1;
        }else{
            x = x + 2;
        }

        System.out.println(x);
    }
}
