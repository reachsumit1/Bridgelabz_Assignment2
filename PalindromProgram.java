package AssignmentDay2;

import java.util.Scanner;

public class PalindromProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev;
        int temp = num;
        for (rev = 0; num > 0; num = num / 10) {
            rev = (rev * 10) + num % 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}