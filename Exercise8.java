import java.util.Scanner;
public class Exercise8 {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int fnumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int Snumber = input.nextInt();
        float div = (float)fnumber/Snumber;

        System.out.printf("The division of %d by %d is %.2f\n",fnumber, Snumber, div);
        input.close();

    }
    
}

    

