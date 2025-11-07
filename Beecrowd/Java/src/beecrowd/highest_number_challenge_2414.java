package beecrowd;

import java.util.Scanner;

public class highest_number_challenge_2414 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0, high_num = 0, i = 0;
        do{
            num = sc.nextInt();
            if(i == 0){
               high_num = num;
            }else if(num > high_num){
                high_num = num;
            }

            i++;
        }while(num != 0);

        System.out.println(high_num);
    }
}
