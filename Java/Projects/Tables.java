
import java.util.*; // importing this because we have to use scanner class.
public class Tables {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Type the number of which you want table of below:");

        int N =  sc.nextInt(); // to take the input from the user
        
        
        // to print the table. here n refers to the number taken by user.
        System.out.println(N * 1);
        System.out.println(N * 2);
        System.out.println(N * 3);
        System.out.println(N * 4);
        System.out.println(N * 5);
        System.out.println(N * 6);
        System.out.println(N * 7);
        System.out.println(N * 8);
        System.out.println(N * 9);
        System.out.println(N * 10);
        
        sc.close();
       
    }
}
