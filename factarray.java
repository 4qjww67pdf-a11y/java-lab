import java.util.Scanner;
public class factarray{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int[] numbers=new int[10];
    System.out.println("Enter the 10 numbers:");
    for(int i=0;i<10;i++){
        System.out.println("numbers"+(i+1)+":");
        numbers[i]=input.nextInt();
    }
    int greatest=numbers[0];
    for(int i=1;i<numbers.length;i++){
        if(numbers[i]>greatest){
            greatest=numbers[i];
        }
    }
    System.out.println("Greatest number is:"+greatest);
    input.close();
}
}