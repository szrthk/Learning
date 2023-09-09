import java.util.*;
public class Menu {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Choose between 1 or 2. 1 : Start and 2 : Stop. ");
        int i = sc.nextInt();

       if(i == 1){
            System.out.println("Enter your Marks");
       } else if ( i == 2){
        System.out.println("You stopped the menu.");
       } else {
        System.out.println("Please enter value 1 or 2 only.");
       }
            int m =  sc.nextInt();
            do { 
                System.out.println("This is good");
                
            } while (m >= 90);

            do {
                System.out.println("This is also good");
                
            } while ( m >=60 );

            do {
                System.out.println("This is good as well");
                
            } while ( m >= 0) ;
            
            
        sc.close();

    }
}
