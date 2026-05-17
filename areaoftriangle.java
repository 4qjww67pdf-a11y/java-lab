import java.util.Scanner;

public class areaoftriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = input.nextInt();

        System.out.println("Enter the value of b:");
        int b = input.nextInt();

        System.out.println("Enter the value of c:");
        int c = input.nextInt();

        // Triangle validity check
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Enter valid triangle sides");
        } else {
            double S = (a + b + c) / 2.0;
            double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));

            System.out.printf("Area of triangle is %.2f", area);
        }

        input.close();
    }
}