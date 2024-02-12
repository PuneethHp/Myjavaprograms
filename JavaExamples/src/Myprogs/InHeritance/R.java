package Myprogs.InHeritance;


class P {
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class Q extends P {
    int b = 10;
    void showB() {
        System.out.println("b = "+b);
    }
}

public class R extends P {

    public static void main(String[] args) {
        R c = new R();
        c.show();
        Q b = new Q();
        b.show();
    }
}

