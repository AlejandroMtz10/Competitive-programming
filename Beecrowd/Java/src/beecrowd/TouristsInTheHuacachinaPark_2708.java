/*
  Problem: Tourists in the Huacachina Park
  ID: 2708
*/

import java.io.IOException;
import java.util.Scanner;

public class TouristsInTheHuacachinaPark_2708 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        String jeep = "";
        int tourists = 0, jeeps = 0, wentOut = 0, returned = 0, jeepsOut = 0, jeepsReturn = 0;
        
        
        while(!jeep.equalsIgnoreCase("ABEND")){
            jeep = sc.next();
            
            if(jeep.equals("SALIDA")){
                wentOut = sc.nextInt();
                
                jeepsOut +=1;
                tourists = tourists + wentOut;
            }else if(jeep.equals("VUELTA")){
                returned = sc.nextInt();
                
                jeepsReturn += 1;
                tourists = tourists - returned;
            }
            
        }
        
        jeeps = jeepsOut - jeepsReturn;
        
        System.out.println(tourists);
        System.out.println(jeeps);
 
    }
 
}
