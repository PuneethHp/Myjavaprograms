package Myprogs;

public class Hello {
    String str="Saif";
    int a = 112;
    static  String str1="puneeth";
    public void change() {
        System.out.println(str);
        System.out.println(a);
    }

    public static void main(String[] args) {
        String str2="vishnu";

        System.out.println(str2);
        System.out.println(str1);
        Hello string= new Hello();
        string.change();
    }
}
