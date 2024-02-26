package Myprogs.MethodOverloading;

public class A {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        System.out.println("print the value of c == " + c);
        System.out.println("print the value of d == " + d);
        System.out.println("print the value of e == " + e);
    }}
    class B{
    void sum (int a, int b)
    {
        System.out.println("sum is"  +(a+b)) ;
    }
    void sum (float a, float b)
    {
        System.out.println("sum is"  +(a+b));
    }

            public static void main(String[] args) {
                Calculate  cal = new Calculate();
                cal.sum (40,60);
                cal.sum (5.6f, 3.5f);
            }
    }

    


