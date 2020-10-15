package stringproblems;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void isAnagram() {
        //Scanner object for taking user input
        Scanner userString = new Scanner(System.in);

        //Taking user input and storing into two new variables
        System.out.println("Enter a word of choice");
        String str1 = userString.next();
        System.out.println("Enter another word of choice");
        String str2 = userString.next();

        //sorting out both inputs and storing them in another variable
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        //Deciding if they have the same length and characters from array
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram.isAnagram();
    }
}
