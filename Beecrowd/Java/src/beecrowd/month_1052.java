package beecrowd;

import java.util.*;

public class month_1052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
		 // Dictionary data
        HashMap<Integer, String> months = new HashMap<>();
        
        int monthNumber = 0;
        
        monthNumber = sc.nextInt();
        
        // Add data to diccionary
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        
        String monthName = months.get(monthNumber);
        
        System.out.println(monthName);
		
		
	}

}
