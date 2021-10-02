package anjali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* In java function in classes is called "Methods". */
        // Q. sum of two number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2 ;
        System.out.println("sum of two number is: " + sum);

    }
}
