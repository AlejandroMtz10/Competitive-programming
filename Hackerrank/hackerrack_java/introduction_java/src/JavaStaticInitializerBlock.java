import java.io.*;
import java.util.*;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b = 0, h = 0, area = 0;
        
        b = sc.nextInt();
        h = sc.nextInt();
        
        if(b > 0 && h > 0){
            area = b * h;
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
    }
}
