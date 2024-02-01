package Myprogs.Constructors;

public class OverLoading {
    String name;
    String team;
    int age;
    OverLoading ()
    {
        name ="  ";
        team ="  ";
        age = 0;
    }
    OverLoading(String n, String t, int a)
    {
        name = n;
        team = t;
        age = a;
    }
    OverLoading (OverLoading cricketer)
    {
        name = cricketer.name;
        team = cricketer.team;
        age = cricketer.age;
    }
    public String toString()
    {
        return "this is " + name + " of "+team +  age;
    }
}

    class O
    {
        public static void main (String[] args)
        {
            OverLoading c1 = new OverLoading();
            OverLoading c2 = new OverLoading("sachin", "India", 32);
            OverLoading c3 = new OverLoading(c2 );
            System.out.println(c2);
            System.out.println(c3);
            c1.name = "Dhoni";
            c1.team= "India";
            c1.age = 32;
            System.out.println(c1);

        }
    }

