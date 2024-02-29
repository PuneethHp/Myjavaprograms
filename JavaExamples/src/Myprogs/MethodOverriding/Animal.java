package Myprogs.MethodOverriding;
class Animal
{
    public void eat()
    {
        System.out.println("Eat all eatables");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog like to eat meat");
    }

    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat();
    }
}

