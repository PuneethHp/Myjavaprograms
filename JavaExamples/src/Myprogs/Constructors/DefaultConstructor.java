package Myprogs.Constructors;

public class DefaultConstructor {
        DefaultConstructor()
        {
            int p=50;
            int q=40;
            int r;
            r=p+q;
            System.out.println("Default Constructor");
            System.out.println("Total of 50 + 40 = "+r);
        }

        public static void main(String args[])
        {
            DefaultConstructor object=new DefaultConstructor();
        }
    }


