package Myprogs.Array;

public class ArrayExample {
        public static void main(String[] args)
        {
            int[] arr = {10,20,30,40,50,60};
            for(int x : arr)
            {
                System.out.println(x);
            }

            // assigning a value

            arr[1] = 108;
            System.out.println("element at first index: " +arr[1]);
        }
    }


