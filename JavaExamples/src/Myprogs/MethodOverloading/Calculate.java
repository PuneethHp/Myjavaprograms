package Myprogs.MethodOverloading;

class Calculate
{
    void sum (int a, int b)
    {
        System.out.println("sum is"  +(a+b)) ;
    }
    void sum (float a, float b)
    {
        System.out.println("sum is"  +(a+b));
    }
    public static void main (String[] args)
{
    Calculate  cal = new Calculate();
    cal.sum (40,60);
    cal.sum (5.6f, 3.5f);
}
}
