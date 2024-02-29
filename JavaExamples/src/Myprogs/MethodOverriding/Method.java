package Myprogs.MethodOverriding;

class Puneeth{
    private double a, b;
    public Puneeth(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString()
    {
        return String.format(a + " + i" + b);
    }
}
public class Method{
    public static void main(String[] args)
    {
        Puneeth obj1 = new Puneeth(30, 20);
        System.out.println(obj1);

    }
}

