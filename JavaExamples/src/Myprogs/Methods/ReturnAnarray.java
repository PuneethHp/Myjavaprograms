package Myprogs.Methods;

public class ReturnAnarray {
        static int[] total(int a, int b)
        {
            int[] s = new int[5];
            s[0] = a + b;
            s[1] = a - b;
            s[2] = a * b;
            s[3] = a / b;
            s[4] = a % b;
        return s;
        }

        public static void main(String[] args)
        {
            int[] s = total(300, 80);
            System.out.println("Addition = " + s[0]);
            System.out.println("Subtraction = " + s[1]);
            System.out.println("Multiplication = " + s[2]);
            System.out.println("Division = " + s[3]);
            System.out.println("Modular Division = " + s[4]);
        }
    }


