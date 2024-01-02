package Myprogs.Array;

public class PrintingElements {
    public static void main(String[] args) {
//        int[] puneeth = {1, 2, 3, 4, 5};
//        for (int arr : puneeth) {
//            if (arr % 2 == 0 || arr == 3) {
//                System.out.println(arr);
//            }
//        }
//        String[] strArray = {"Str1", "Str2", "Str3", "Str4", "Str5"};
//        for (String var : strArray) {
//            if (var == "Str3") {
//                System.out.println(var);
//            }
//        }
        int[] coolArray = {1, 2, 3, 4, 5};
        for (int vice : coolArray) {
            int sum = vice * 3;
            if (sum % 2 == 0) {
                System.out.println(sum);
            }
        }

        for(int i=0; i < coolArray.length ;i++){
            int sum = coolArray[i];
            System.out.println(sum*3);
        }





    }
}

