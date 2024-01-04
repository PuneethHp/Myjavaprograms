package Myprogs.SwitchStatements;

public class Months {
    public static void main(String[] args) {
        String month = "7";
        switch (month){
            case "1":
                month = "jan";
                System.out.println(month);

            case "2":
                month = "Feb";
                System.out.println(month);

            case "3":
                month = "Mar";
                System.out.println(month);

            case "4":
                month = "Apl";
                System.out.println(month);

            case "5":
                month = "May";
                System.out.println(month);

            case "6":
                month = "jun";
                System.out.println(month);
                break;
            default:
                System.out.println("out");
        }
    }
}
