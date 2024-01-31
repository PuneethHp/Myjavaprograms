package Myprogs.BreakContinuexample;

public class BreakContinueexam2 {
        public static void main(String[] args)
        {
            int i=1;
            do
            {
                if(i==16)
                {
                    i++;
                    break;
                }
                System.out.println(i);
                i++;
            }while(i<=20);
        }
    }


