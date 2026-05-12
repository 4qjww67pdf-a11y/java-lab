//wap a program to swap two numbers
// public class Swapnumbers {
//     public static void main(String [] args){
//         int a=10;
//         int b=20;
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.printf("numbers apfter swapping a=%d b=%d\n", a, b ,temp);

//     }

    
// WAP to finf the sum of a three digit number
//import java.util.Scanner;
//public class Sumofthree{
//public static void main(String [] args){
//  Scanner input=new Scanner(System.in);
//System.out.print("Enter a three digit numner: ");
//int num = input.nextInt();
//int c=num%10;
//int b=(num/10)%10;
//int a=num/100;
//int sum=a+b+c;
//System.out.printf("Sum of three digit number is %d",sum);
//input.close();

//}
//}

//WAp to find the reverse of a three digit number
//import java.util.Scanner;
 //class reverse{
 // public static void main(String [] args){
  //  Scanner input=new Scanner(System.in);
//System.out.print("Enter a three digit number: ");
//int num = input.nextInt();
//int digit1 = num % 10;       
//int digit2 = (num / 10) % 10; 
//int digit3 = num / 100;       
//int reverse = digit1 * 100 + digit2 * 10 + digit3;
//System.out.printf("reverse of three digit number is %d",reverse);
//input.close();
//}
//}

//Wap to ceonver temperature in degree to fahrenheit
//import java.util.Scanner;
//class temp{
 // public static void main(String [] args){

   // Scanner input=new Scanner(System.in);
    //System.out.print("Enter the temperature in celcius: ");
    //float temp = input.nextInt();
    //float F=(temp * 9/5)+32;
//System.out.printf("The temperature converted to fahrenheit is %f",F);
//input.close();
  //}
//}

//wap to find the sum of first 10 natural numbers(using while loop)
//import java.util.Scanner;
//class  sumoften{

  //public static void main(String [] args){
    //int i=1;

    //int total=0;
    
   // while(i<=10){
    
    //total+=i;
      //i++;
    //}
//System.out.printf("The sum of ten natural number is %d",total);
  //}
//}

//wap to print multiplication table of 5 using for loop


class table{
  public static void main(String [] args){
int i=1;
for(i=1;i<=10;i++){
  int result=5*i;
  
  System.out.println("5*"+i+"="+result);
}
}
}