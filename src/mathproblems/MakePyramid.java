package mathproblems;

public class MakePyramid {
    public static void main(String[] args) {

        MakePyramid.pyramid();

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */


        }

    public static void pyramid() {
        int rowCount = 6, k = 0;

        for(int i = 1; i <= rowCount; ++i, k = 0) {
            for (int space = 1; space <= rowCount - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        }

  }
