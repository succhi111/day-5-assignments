import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        System.out.println("Enter the value of X");
        Scanner ref=new Scanner(System.in);
        int x= ref.nextInt();

        System.out.println("Enter the value of Y");
        int y= ref.nextInt();

      double d= Math.sqrt(x*x + y*y);
        System.out.println("The total distance =" +d);
    }
}
