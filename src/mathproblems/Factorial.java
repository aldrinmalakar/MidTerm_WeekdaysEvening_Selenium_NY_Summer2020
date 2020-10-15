package mathproblems;


public class Factorial {

    public static void main(String[] args) {
        Factorial.findFactoral();

        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }

    public static void findFactoral() {
        int a, factoral = 1;
        int number = 5;//It is the number to calculate factorial
        for (a = 1; a <= number; a++) {
            factoral = factoral * a;
        }
        System.out.println("Factorial of " + number + " is: " + factoral);
    }
}
