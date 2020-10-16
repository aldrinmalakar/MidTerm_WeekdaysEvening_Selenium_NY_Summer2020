package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("***** Arithmetic Calculator of Two Values *******");
        System.out.println("Please enter your first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter your second number: ");
        num2 = scan.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + doAddition(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + doSubtraction(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + doMultiplication(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + doDivision(num1,num2));



    }


    public static int doAddition(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public static int doSubtraction(int num1, int num2){
        int total = num1 - num2;
        return total;
    }

    public static int doMultiplication(int num1, int num2){
        int total = num1 * num2;
        return total;
    }

    public static int doDivision(int num1, int num2){
        int total = num1 / num2;
        return total;
    }




}
