import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter any one number from 1, 2 or 3:");
        int button =  sc.nextInt();

        
        // THis is the 
        // if (button ==  1){
        //     System.out.println("Hello");
        // } else if (button == 2){
        //     System.out.println("Namaste");
        // } else if (button == 3){
        //      System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invalid Entry! Please type 1, 2 or 3  only.");
        // }
    
            switch(button) {
                case 1 : System.out.println("Hello");
                break;
                case 2 : System.out.println("Namaste");
                break;
                case 3 : System.out.println("Bonjour");
                break;
                default : System.out.println("Invalid entry");
            
            }
            
        




        sc.close();
    }
}
