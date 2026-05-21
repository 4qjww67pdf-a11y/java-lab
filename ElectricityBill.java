import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        // First 20 units
        if (units <= 20) {
            bill = 80;
        }

        // Next 100 units
        else if (units <= 120) {
            bill = 80 + (units - 20) * 7.5;
        }

        // Next 200 units
        else if (units <= 320) {
            bill = 80 + (100 * 7.5) + (units - 120) * 8.5;
        }

        // Above 320 units
        else {
            bill = 80 + (100 * 7.5) + (200 * 8.5)
                    + (units - 320) * 9.5;
        }

        System.out.println("Total Electricity Bill = Rs " + bill);

        sc.close();
    }
}