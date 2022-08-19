import java.util.Scanner;
public class PrimeFactorize {



        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            for (int div = 2; div * div <= n; div++)
            {
                while (n % div == 0)
                {
                    System.out.println(div + " ");
                    n = n / div;
                }
            }

        }

}
