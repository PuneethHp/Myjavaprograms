package Myprogs.Array;

public class PrintingAllElements {

    //Declare an array of size 3, store the values and print all the elements in the array using for loop
    //write the program here
    public static void main(String[] args) {

        int[] myArray = new int[3];


        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        System.out.println("Elements in the array:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }

}
