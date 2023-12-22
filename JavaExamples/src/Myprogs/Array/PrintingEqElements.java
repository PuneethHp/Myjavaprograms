package Myprogs.Array;

public class PrintingEqElements {

    int[] arr = {1, 2, 3, 4, 5};
    //print only value 4 from the array using for loop
    //write the program here

        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5};

            for (int element : myArray) {
                if (element == 4) {
                    System.out.println(element);
                }
            }
        }
    }



