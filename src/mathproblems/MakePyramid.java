package mathproblems;

public class MakePyramid {
    //Done
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

//Calling to method to perform required code:
    patternMethod();

        }

    private static void patternMethod() {
         int rowCount = 6, k = 0;

            for(int i = 1; i <= rowCount; ++i, k = 0) {
                for(int space = 1; space <= rowCount - i; ++space) {
                    System.out.print("  ");
                }

                while(k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }

                System.out.println();
            }
        }
    }



