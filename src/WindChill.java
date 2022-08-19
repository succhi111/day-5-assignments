import jdk.jfr.consumer.RecordedFrame;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter time");
        int t = ref.nextInt();

        System.out.println("Enter velocity");
        int v = ref.nextInt();

        double w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75 * Math.pow(v, 0.16)));

        System.out.println("wind chill=" +w);
    }

}
