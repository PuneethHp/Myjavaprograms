package Myprogs.Constructors;

public class ConstructorChainingexample
    {
        public ConstructorChainingexample()
        {
            this(30);
            System.out.println("Default Constructor");
        }
        public  ConstructorChainingexample(int x)
        {
            this(40, 50);
            System.out.println("Constructor with one Parameter");
            System.out.println("Value of x ==> "+x);
        }
        public ConstructorChainingexample(int x, int y)
        {
            System.out.println("Constructor with two Parameter");
            System.out.println("Value of x and y ==> "+x+" "+y);
        }
    }
    class Chaining
    {
        public static void main(String as[])
        {
           ConstructorChainingexample Constructor = new ConstructorChainingexample();
        }
    }


