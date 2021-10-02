package anjali;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class newMethod2 {
    public static void main(String[] args) {
        sum();
      //  sum();== if we again write this the it means that we are calling the function twice
        //we know that main is the first function that will run.
        // sum() === means calling the function.
        //Anything we want to use in static means it should be also static.
    }
    static void sum(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1= input.nextInt();
        System.out.println("Enter the number: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of numbers are " +sum);
    }
    /* return_type_name(){
    body
    return statement;
     */



}
