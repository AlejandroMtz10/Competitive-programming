package beecrowd;
import java.util.Scanner;
public class animal_1049 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        String bones, type, eat;

        bones = sc.nextLine();
        type = sc.nextLine();
        eat = sc.nextLine();

        if(bones.equals("vertebrado")){
            if(type.equals("ave")){
                if (eat.equals("carnivoro")){
                    System.out.println("aguia");
                } else if (eat.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (type.equals("mamifero")) {
                if (eat.equals("onivoro")){
                    System.out.println("homem");
                } else if (eat.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        }else if(bones.equals("invertebrado")){
            if(type.equals("inseto")){
                if (eat.equals("hematofago")){
                    System.out.println("pulga");
                } else if (eat.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (type.equals("anelideo")) {
                if (eat.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else if (eat.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
