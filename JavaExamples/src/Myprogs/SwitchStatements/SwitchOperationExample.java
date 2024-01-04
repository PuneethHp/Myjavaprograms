package Myprogs.SwitchStatements;

public class SwitchOperationExample {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        int c = 10;
        String op = "+";
        int result;
        switch (op) {
            case "+":
                result = a + b + c;
                System.out.println(result);
                break;
            case "-":
                result = a - b - c;
                System.out.println(result);
                break;
            case "*":
                result = a * b * c;
                System.out.println(result);
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                    System.out.println(result);
                }
                break;
            case "%":
                result = a%b;
                System.out.println(result);
                break;
            default:
                System.out.println("Operation cannot be done");
                break;
        }


    }
}

