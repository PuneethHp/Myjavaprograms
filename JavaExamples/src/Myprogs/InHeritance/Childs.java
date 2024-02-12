package Myprogs.InHeritance;

class Parents
{
    String name;

    public void details() {
    }
}
public class Childs extends Parents {
    String name;
    public void details()
    {
        super.name = "Parent";
        name = "Child";
        System.out.println(super.name+" and "+name);
    }
    public static void main(String[] args)
    {
        Childs cobj = new Childs();
        cobj.details();
    }

    public void c1() {
    }

    public void p1() {
    }
}
