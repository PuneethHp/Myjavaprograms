package Myprogs.Methods;

public class AllOperations {

    public static void main(String[] args) {

        int a = 11;
        int b = 20;
//        System.out.println("Sum of two numbers is : " + add(a, b));
//        System.out.println("Subtraction of two numbers is : " + subtract(a, b));
//        System.out.println("Multiplication of two numbers is : " + multiply(a, b));
//        System.out.println("Division of two numbers is : " + divide(a, b));
//        System.out.println("Modulus of two numbers is : " + mdivide(a, b));
//        System.out.println("Result of num1 is : " + divide(a, 2));
//        System.out.println("Result of num2  is : " + divide(b, 2));
        checkPositive(a,b);
        //if it is divisble by 2 return value or else 0
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;

    }

    public static int mdivide(int num1, int num2) {
        return num1 % num2;

    }

    public static void checkSum(int num1, int num2) {
        int num3 = num1 + num2;
        if (num3 % 2 == 0) {
            System.out.println("the value is divisible by 2");
        } else {
            System.out.println("the value is not divisible by 2");
        }
    }
    public static void checkNegitive(int num1 ,int num2){
      int num4 = num1 - num2 ;
      if (num4 - 2 == 0) {
          System.out.println("The value is even");
      }else {
          System.out.println("The value is odd");
      }
    }
    public static void checkPositive(int num1 ,int num2) {
        int num5 = num1 + num2;
        if (num5 + 2 == 0) {
            System.out.println("The value is Even");
        } else {
            System.out.println("The value is Odd");
        }
    }
    public static void checkMul(int num1 ,int num2){
        int num6 = num1 + num2;
        if(num6 +  2 == 0){
            System.out.println("The value is mul of 2");
        }else {
            System.out.println("The value is not mul of 2");
        }


}}





























