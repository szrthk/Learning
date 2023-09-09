import java.util.*;
public class Calculator {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     
     
     System.out.println("Type the value of first number: ");
     int Number_1 = sc.nextInt();
     System.out.println("Choose the operator: +, -, *, /, %.");
     int Operator =  sc.next().charAt(0);
     System.out.println("Type the value of second number: ");
     int Number_2 = sc.nextInt();
     

        System.out.println("Your Result: ");

     switch (Operator) {
        case '+' : System.out.println(Number_1+Number_2);
        break;
        
        case '-' : System.out.println(Number_1-Number_2);
        break;

        case '*' : System.out.println(Number_1*Number_2);
        break;

        case '/' : if(Number_2 == 0){
            System.out.println("Invalid decision");
        } 
        else {
            System.out.println(Number_1/Number_2);
        }

        case '%' : if (Number_2 == 0){
            System.out.println("Invalid decision");
        }
            else {
                System.out.println(Number_1 % Number_2);
        break;
         
            }
            default : System.out.println("Invalid Operator");
     }










        sc.close();
    }
}
