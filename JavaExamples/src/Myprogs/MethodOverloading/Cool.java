package Myprogs.MethodOverloading;

class Cool
{
    void multiply(int l, int b)
    {
        System.out.println("Result is"+(l*b)) ;
    }
    void multiply(int l, int b,int h)
    {
        System.out.println("Result is"+(l*b*h));
    }

    public static void main(String[] args)
    {
        Cool  ar = new Cool();
        ar.multiply(45,2);
        ar.multiply(12,13,14);

    }
}
