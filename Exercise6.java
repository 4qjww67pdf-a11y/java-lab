import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input your first name: ");
    String fname = input.next();
    System.out.print("Input your Last name: ");
    String lname = input.next();
     System.out.println();
    System.out.println("Hello!  " + fname + " "+lname +", How are you ?");
        input.close();
    }
}
