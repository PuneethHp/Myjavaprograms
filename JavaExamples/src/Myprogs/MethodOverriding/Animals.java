package Myprogs.MethodOverriding;
class Animals
{
    Animal getObj()
    {
        System.out.println("Animal object");
        return new Animal();
    }
}

class Dogs extends Animal
{
    Dogs getObj()
    {   System.out.println("Dog object");
        return new Dogs();
    }

    public static void main(String[] args) {
        new Dogs().getObj();
    }
}

