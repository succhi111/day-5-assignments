import java.util.Scanner;

public class Harmonic {
    private static double result;

    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        double result = 0.0;

        for (int i = num; i > 0; i--) {
            result = result + (double) 1 / i;
            System.out.println(result + ",");
        }
    }
}
