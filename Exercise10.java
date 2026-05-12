import java.util.Scanner;
public class Exercise10 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = get.nextFloat();

        System.out.print("Enter the second number: ");
        float b = get.nextFloat();

      float product = (float) a * b;
        System.out.printf("The product of %.2f and %.2f is %.2f\n", a, b, product);

        get.close();
    }
    
}
