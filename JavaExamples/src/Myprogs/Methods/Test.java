package Myprogs.Methods;

public class Test {
    public void callByValue(int x)
    {
        x=200;
    }
    public static void main(String[] args)
    {
        int x=100;
        Test t = new Test();
        t.callByValue(x);
        System.out.println(x);
    }

}

