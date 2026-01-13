package flowControlStatement.DoWhileLoopStmt;

public class Program1perfectno {

    public static void main(String[] args) {
        int num = 6;
        int i = 1;
        int sum = 0;

        do {
            if (num % i == 0) {
                sum += i;   // add divisor
            }
            i++;
        } while (i < num);

        if (sum == num) {
            System.out.println("perfect");
        } else {
            System.out.println("Not perfect");
        }
    }
}

