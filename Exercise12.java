import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (number <= 0){
            System.out.println("The number is zero or less ");

        }
        else if(number % 2==0){
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is Odd");

        }
        input.close();


    }
}
