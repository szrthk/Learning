package Trials;
import java.util.*;
public class ifelseifelse {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of A:");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
         
        if (A==B){
            System.out.println("The above entered numbers are same.");
        }
        else if(A>B){
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater than A");

            sc.close();
        }
    }
}
