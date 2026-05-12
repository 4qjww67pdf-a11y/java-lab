import java.util.Scanner;
public class Exercise14 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        char choice;  
        do{
            System.out.print("Enter the number: ");
            int num = input.nextInt();

            if (num % 2 == 0){
                System.out.printf("%d is the even number\n", num);
            }

            else{
                System.out.printf("%d is the odd number\n", num);
            }

            System.out.print("Do you want to try again ? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thanks for using my program");
        
        input.close();
    }
}
