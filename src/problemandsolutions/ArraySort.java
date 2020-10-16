package problemandsolutions;

import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int array[] = new int[num];

        System.out.println("Enter the 10 integers you want to sort in a array: ");

        for (int i = 0; i < num; i++)
            array[i] = input.nextInt();

        bubbleSortAscending(num,array);


    }

    public static void bubbleSortAscending (int num, int [] array ){

        int temp;
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (int i = 0; i < num; i++)
            System.out.print(array[i] + " ");
    }

}

