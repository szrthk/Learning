package Trials;
import java.util.*;
public class kchbhi {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 or 2. 1 means Start and 2 means stop.");
        int a = sc.nextInt();
        
        if (a==1) {
        System.out.println("Type your Physics marks:");
        int p = sc.nextInt();
        System.out.println("Type your Chemistry marks: ");
        int c = sc.nextInt();
        System.out.println("Enter your Maths marks: ");
        int m = sc.nextInt();

            System.out.println("Your pcm average: ");
            System.out.println(p+c+m/3);
        }
        else{
            System.out.println("You closed the Average calculator");
        
        }
        sc.close();
    }
}
