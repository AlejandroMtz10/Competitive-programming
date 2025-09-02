package beecrowd;
import java.util.Scanner;
public class salary_increase_1048 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int percent = 0;
        float salary = 0, new_salary = 0;
        double increase = 0;

        salary = sc.nextFloat();

        if(salary > 0 && salary <= 400){
            percent = 15;
            increase = salary * 0.15;
            new_salary = (float) (salary + increase);
        }

        if(salary > 400 && salary <= 800){
            percent = 12;
            increase = salary * 0.12;
            new_salary = (float) (salary + increase);
        }

        if(salary > 800 && salary <= 1200){
            percent = 10;
            increase = salary * 0.10;
            new_salary = (float) (salary + increase);
        }

        if(salary > 1200 && salary <= 2000){
            percent = 7;
            increase = salary * 0.07;
            new_salary = (float) (salary + increase);
        }

        if(salary >2000){
            percent = 4;
            increase = salary * 0.04;
            new_salary = (float) (salary + increase);
        }

        System.out.println("Novo salario: " + String.format("%.2f", new_salary));
        System.out.println("Reajuste ganho: " + String.format("%.2f", increase));
        System.out.println("Em percentual: "+ percent + " %");

    }
}
