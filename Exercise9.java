import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        
        int a = input.nextInt();
        

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        int product = a * b;

        System.out.printf("The product of %d and %d is : %d\n",a, b, product);
        input.close();

    }
    
}
