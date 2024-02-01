package Myprogs.Methods;

public class SmallNumberfinder {

        public static void main(String[] args) {


            System.out.print("Input the first number: ");
            int num1 = 11;


            System.out.print("Input the second number: ");
            int num2 = 12;


            System.out.print("Input the third number: ");
            int num3 = 13;


            int smallest = SmallNumberfinder(num1, num2, num3);
            System.out.println("The smallest number is: " + smallest);

        }

        public static int SmallNumberfinder(int a, int b, int c) {
            return Math.min(Math.min(a, b), c);
        }
    }


