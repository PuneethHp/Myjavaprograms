package Myprogs.Constructors;

public class ConstructorChaining {


        ConstructorChaining()
        {
            this(12);
        }
        ConstructorChaining(int x)
        {
            System.out.println("x="+x);
        }
        public static void main(String arg[])
        {
            ConstructorChaining object = new ConstructorChaining();
        }
    }


