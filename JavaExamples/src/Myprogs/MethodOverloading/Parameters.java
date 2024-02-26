package Myprogs.MethodOverloading;

class Parameters{

    public void get(String name,  int id )
    {
        System.out.println("Company Name :"+ name);
        System.out.println("Company Id :"+ id);
    }

    public void get(int id, String name)
    {
        System.out.println("Company Id :"+ id);
        System.out.println("Company Name :"+ name);
    }
}

class MethodHi2{
    public static void main (String[] args) {
        Parameters obj = new Parameters();
        obj.get("Nexzera", 2);
        obj.get("Skillbridge", 3);
    }
}


