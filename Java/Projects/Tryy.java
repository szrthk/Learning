import java.util.*;
public class Tryy {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter your PCM marks respectively:");

        
        int p = sc.nextInt();
    
        int c =  sc.nextInt();
  
        int m = sc.nextInt();

        int average =  p + c + m / 3;

        System.out.println("Here is your data with aggregate:");

      
        System.out.println(average);

        sc.close();
    }
}
