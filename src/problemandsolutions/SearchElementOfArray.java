package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60,70,80,90,100};
        int select;
        boolean isTrue = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Find the element of the array");
        System.out.println("Which value do you select: ");
        select = scan.nextInt();

        for (int i=0; i<array.length - 1; i++){
            if(array[i] == select){
                isTrue = true;
                System.out.println("The value is at the " + i + " position");
            }
        }

        if(isTrue == false){
            System.out.println("Please enter a valid value in the array next time");
            for (int arr: array) {
                System.out.print(arr + " ");

            }
        }

    }
}
