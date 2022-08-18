public class Swap {
        public static void main(String[] args){
            int num1 , num2, temp;
            num1 = 45;
            num2 = 70;
            System.out.println("----Before swap----");
            System.out.println("The first number is " + num1 + " and the second number is " + num2 );
            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("----After swap----");
            System.out.println("The first number is " + num1 + " and the second number is " + num2 );
        }
    }

