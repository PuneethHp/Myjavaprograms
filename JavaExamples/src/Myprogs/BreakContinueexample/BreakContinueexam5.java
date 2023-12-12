package Myprogs.BreakContinueexample;

public class BreakContinueexam5 {
    public static void main(String[] args) {
        xy:
        for (int i = 1; i <= 5; i++) {
            pq:
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && j == 2) {
                    continue xy;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

