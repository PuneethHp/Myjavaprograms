package Myprogs.InHeritance;

class E {
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class D extends E {
    int b = 10;
    void showB() {
        System.out.println("b = "+b);
    }
}

public class F extends D {

    public static void main(String[] args) {
        F c = new F();
        c.show();
        c.showB();
    }
}



