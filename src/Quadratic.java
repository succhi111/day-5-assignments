import java.sql.SQLOutput;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a ");
        int a = sc.nextByte();
        System.out.print("Enter value of b ");
        int b = sc.nextByte();
        System.out.print("Enter value of c ");
        int c = sc.nextByte();
        double d = (b * b - 4 * a * c);      //delta

        double x = (-b - d) / (2 * a);
        double e = Math.sqrt(a * x * x + b * x + c);     //expression
        System.out.println("The value of the given quadratic equation is : "  + e);

    }
}
