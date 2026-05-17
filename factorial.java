
//Wap to find the factorial of a number
import java.util.Scanner;
public class factorial {
   public static void main(String[] args){   
   Scanner input=new Scanner(System.in);
   while(true){
   System.out.println("\nEnter a number for factorial or 0 to exit:");
   int num=input.nextInt();
   if(num==0){
    System.out.println("We are exiting the program:");
    break;
   }
   else{
   long fact=1;
   for(int i=1;i<=num;i++){
    fact=fact*i;
   }
   System.out.printf("The factorial of %d is %d",num,fact);
}
}
   input.close();
   }
}
