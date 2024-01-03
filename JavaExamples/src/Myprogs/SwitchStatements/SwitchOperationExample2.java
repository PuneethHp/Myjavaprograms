package Myprogs.SwitchStatements;

public class SwitchOperationExample2 {
    public static void main(String[] args) {
        int a = 40;
        String op1 = "2";
        int result ;
        switch (op1){
            case "2":
            result = a * 2;
                System.out.println(result);
                break;
            case "3":
                result = a*3;
                System.out.println(result);
                break;
            case "4":
                result = a*4;
                System.out.println(result);
                break;
            case "5":
                result = a*5;
                System.out.println(result);
                break;
            default:
                System.out.println("number not available");
        }

    }
}
