package Myprogs.InHeritance;


class Z {
    int a = 30;
    void show() {
        System.out.println("a = "+a);
    }
}

public class X extends Z {

    public static void main(String[] args) {
        X b = new X();
        b.show();

    }
}

