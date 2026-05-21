import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user1, user2;

        System.out.print("User 1 enter (rock/paper/scissor): ");
        user1 = sc.next().toLowerCase();

        System.out.print("User 2 enter (rock/paper/scissor): ");
        user2 = sc.next().toLowerCase();

        if (user1.equals(user2)) {
            System.out.println("It's a draw!");
        }
        else if (
            (user1.equals("rock") && user2.equals("scissor")) ||
            (user1.equals("scissor") && user2.equals("paper")) ||
            (user1.equals("paper") && user2.equals("rock"))
        ) {
            System.out.println("User 1 wins!");
        }
        else if (
            (user2.equals("rock") && user1.equals("scissor")) ||
            (user2.equals("scissor") && user1.equals("paper")) ||
            (user2.equals("paper") && user1.equals("rock"))
        ) {
            System.out.println("User 2 wins!");
        }
        else {
            System.out.println("Invalid input! Please enter rock, paper, or scissor only.");
        }

        sc.close();
    }
}