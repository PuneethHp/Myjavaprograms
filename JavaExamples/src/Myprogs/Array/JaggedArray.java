package Myprogs.Array;

public class JaggedArray {
        public static void main(String[] args)
        {
            int arr[ ][ ] = {{1,2,3},{4,5,10},{6,7,8,9}};
            for(int i=0;i<5;i++)
            {
                for (int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }

        }
    }


