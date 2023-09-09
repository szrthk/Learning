
import java.util.*;
public class area{
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int r;
            double pi = 3.14, area;
        System.out.print("Enter the radius of circle: ");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.print("The area of circle is: " +area);


        }
    }
}
