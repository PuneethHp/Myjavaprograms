package Myprogs.MethodOverloading;

public class Main{
    public static void main(int args)
    {
        System.out.println("Main Method with int argument Executing");
        System.out.println(args);
    }
    public static void main(char args)
    {
        System.out.println("Main Method with char argument Executing");
        System.out.println(args);
    }
    public static void main(Double[] args)
    {
        System.out.println("Main Method with int Executing");
        System.out.println(args);
    }
    public static void main(String[] args)
    {
        System.out.println("Original main Executing");
        Main.main(52);
        Main.main('G');
        Main.main(2589);
    }
}

