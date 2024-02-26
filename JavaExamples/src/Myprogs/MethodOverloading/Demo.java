package Myprogs.MethodOverloading;

    public class Demo
    {
        public void test(Integer i)
        {
            System.out.println("test(Puneeth) ");
        }
        public void test(String name)
        {
            System.out.println("test(String) ");
        }
        public static void main(String [] args)
        {
            Demo obj = new Demo();
            obj.test((Integer) null);
        }
    }


