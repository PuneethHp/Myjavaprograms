package Myprogs.Methods;

public class ReturnObject {
        int a;
        double b;
        int c;
        int d;
        ReturnObject(int m, double d, int a)
        {
            this.a = m;
            this.b = d;
            this.c = a;
        }
    }
    class Method4{
        static ReturnObject get(int x, int y)
        {
            return new ReturnObject(x * y, (double)x / y, (x + y));
        }
        public static void main(String[] args)
        {
            ReturnObject ans = get(25, 5);
            System.out.println("Multiplication = " + ans.a);
            System.out.println("Division = " + ans.b);
            System.out.println("Addition = " + ans.c);
        }
    }


