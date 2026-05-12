import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name:");
        String lname = input.next();
        System.out.print("Enter your age: ");
        int age =input.nextInt();
        System.out.println();
        System.out.println("Hi\n"+ fname+" "+lname);
        System.out.println("i am "+ age +"years old");
        input.close();
    }
    
}
