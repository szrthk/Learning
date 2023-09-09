import java.util.*;

public class Conditions {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age below: ");
       int age = sc.nextInt();

       if (age > 18) {
        System.out.println("You are an Adult");
       } else {
        System.out.println("Sorry you are not Adult");
        sc.close();
       }
    }
}
