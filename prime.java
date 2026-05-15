import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num, i, count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime Number");
        } else {
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }
    }
}