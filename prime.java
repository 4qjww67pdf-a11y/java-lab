import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check if it is prime 0 to exit:");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("We are exiting the program.");
                break;
            }

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.printf("The number %d is prime\n", num);
            } else {
                System.out.printf("The number %d is not prime\n", num);
            }
        }

        input.close();
    }
}