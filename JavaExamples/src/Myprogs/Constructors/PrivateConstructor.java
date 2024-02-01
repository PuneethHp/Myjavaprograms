package Myprogs.Constructors;

public class PrivateConstructor {
        private PrivateConstructor()
        {}
        public static void add(int a, int b)
        {
            int z = a+b;
            System.out.println("Addition: "+z);
        }
        public static void sub(int x, int y)
        {
            int z = x-y;
            System.out.println("Subtraction: "+z);
        }

    }
    class PrivateConDemo
    {
        public static void main(String as[])
        {
            PrivateConstructor.add(20, 10);
            PrivateConstructor.sub(20, 10);
        }
    }


