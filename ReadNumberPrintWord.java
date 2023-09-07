package AssignmentDay2;
import java.util.Scanner;

public class ReadNumberPrintWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("One");
        } else if (num==10) {
            System.out.println("Ten");
        } else if (num==100) {
            System.out.println("Hundred");
        } else if (num==1000) {
            System.out.println("Thousand");
        }else{
            System.out.println("Incorrect input number..");
        }
    }
}