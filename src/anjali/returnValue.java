package anjali;

import java.util.Scanner;

public class returnValue {
    public static void main(String[] args) {
        // suppose if we want the value of sum not print it
       int ans = sum();
        System.out.println(ans);
    }
    //return the value -- means the value of the function call.[means value of sum()].
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number.");
        int num= input.nextInt();
        System.out.print("enter the second number .");
        int num1 = input.nextInt();
       int sum = num1+num;
       return sum;
       // means here our program ends.and even if we want to print single statement we cannot even print that.
    }
}
