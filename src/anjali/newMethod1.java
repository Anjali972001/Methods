package anjali;

import java.util.Scanner;

public class newMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2,  sum;
        System.out.println("Enter the first number: ");
        num1=input.nextInt();
        System.out.println("Enter the second number: ");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println("The sum of two number is " +sum);
    }
}
