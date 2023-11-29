package Myprogs.Loops;

public class CurrentBill {

    public static void main(String[] args) {
        int units = 150;
        double TotalBillAmount = 0;
        if (units<=100){
            TotalBillAmount =units*2;

        }else{
            TotalBillAmount = 100 * 2;
            int remainingUnits = units - 100;
            TotalBillAmount  = TotalBillAmount + remainingUnits*5;
            System.out.println(TotalBillAmount);
        }
    }
}






