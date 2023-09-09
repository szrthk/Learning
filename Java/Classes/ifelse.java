import java.util.*; // this is the java library in which scanner is present
public class ifelse {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in); // use to open scanner which take input from user
        System.out.println("Enter the value of a:"); 
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("The numbers are equal");
        } 
        else if (a > b){
            System.out.println("A is greater");
        } 
        else {
            System.out.println("A is smaller");
        }
            sc.close();
        }
    }

    

