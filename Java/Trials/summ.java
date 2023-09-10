package Trials;
import java.util.*;
public class summ {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second  number: ");
        int b = sc.nextInt();

        System.out.println("The sum of the above data is:  ");
        System.out.println(a+b );

        System.out.println("The product of the above number is: ");
        System.out.println(a*b);

        sc.close();
    }
}
