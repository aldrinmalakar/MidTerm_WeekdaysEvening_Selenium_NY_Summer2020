package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        arithmetic();

    }

    public static void arithmetic() {
        int a;
        int b;

        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter two integers with a space in between");
        a = stdin.nextInt();
        b = stdin.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;

        System.out.println("The sum of the integers is " + c);
        System.out.println("The difference between the integers is " + d);
        System.out.println("The multiple the integers is " + e);
        System.out.println("The quotient of the integers is " + f);

    }



}
