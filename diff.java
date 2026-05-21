/* Difference between do while and while loop */
public class diff {
    public static void main(String[] args){
int count1=10;
while(count1<2){
    System.out.println("we will not enter the while loop because the condition is false:");
}
System.out.println("End of while loop:");
int count2=7;
do {
    System.out.println("We will enter the loop once even the condition is false:");
}while(count2<2);
System.out.println("End of do while loop:");
    }
}