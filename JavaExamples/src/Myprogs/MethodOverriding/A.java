package Myprogs.MethodOverriding;

class A
{
    public A()
    {
        System.out.println("Eat all eatables");
    }
}

class D extends A
{
    protected void eat()
    {
        System.out.println("Dog like to eat meat");
    }

    public static void main(String[] args) {
        D d = new D();
        d.eat();
    }
}

