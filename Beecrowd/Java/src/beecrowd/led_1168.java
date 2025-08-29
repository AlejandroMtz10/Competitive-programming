package beecrowd;
import java.util.Scanner;
public class led_1168 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cases; i++) {
            String number = sc.nextLine();

            int leds = 0;

            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);

                // Count the digits for the leds
                switch (digit) {
                    case '1':
                        leds += 2;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        leds += 5;
                        break;
                    case '0':
                    case '6':
                    case '9':
                        leds += 6;
                        break;
                    case '8':
                        leds += 7;
                        break;
                }
            }
            // Print the result
            System.out.println(leds + " leds");
        }

        sc.close();

    }
}
