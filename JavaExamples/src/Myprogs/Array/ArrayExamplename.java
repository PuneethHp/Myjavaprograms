package Myprogs.Array;

public class ArrayExamplename {
    public static void main(String[] args) {

        String arr[][] = {{"Arjun", "Krishna", "Ashok"}, {"Puneeth", "Gowtham", "Pradeep"}, {"Arian", "Baldev", "Mahavir"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == "Puneeth"){
                    System.out.print("hi puneeth ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}


