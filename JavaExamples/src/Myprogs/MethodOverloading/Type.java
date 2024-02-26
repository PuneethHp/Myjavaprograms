package Myprogs.MethodOverloading;

class Type
{
    void sum(int l,long b)
    {
        System.out.println("Sum is"+(l+b)) ;
        System.out.println("value of h is" + (l*b));
    }
    void sum(int l, int b, int h)
    {
        System.out.println("Value is"+(l+b+h));
        System.out.println("Value is " + (l*b));
    }
    public static void main (String[] args)
    {
        Type  ar = new Type();
        ar.sum(9,10);
    }
}

