package Myprogs.Methods;

public class ReturnAnarray {
        static int[] total(int a, int b)
        {
            int[] s = new int[2];
            s[0] = a + b;
            s[1] = a - b;
            return s;
        }

        public static void main(String[] args)
        {
            int[] s = total(300, 80);
            System.out.println("Addition = " + s[0]);
            System.out.println("Subtraction = " + s[1]);
        }
    }


