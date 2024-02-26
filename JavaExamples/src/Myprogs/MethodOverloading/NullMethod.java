package Myprogs.MethodOverloading;

public class NullMethod
{
    public void test(Integer i)
    {
        System.out.println("Method ==> test(Integer)");
    }
    public void test(String name)
    {
        System.out.println("Method ==> test(String) ");
    }
    public static void main(String [] args)
    {
        NullMethod obj = new NullMethod ();
        Integer a = null;
        obj.test(a);
        String b = null;
        obj.test(b);
    }
}

