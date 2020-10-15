package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {

    }

    public static void anyNumber(){
        Random number = new Random(1);
        number.setSeed(8);
        int randomNumber = number.nextInt(8);
        System.out.println(number.nextInt());
    }







}
