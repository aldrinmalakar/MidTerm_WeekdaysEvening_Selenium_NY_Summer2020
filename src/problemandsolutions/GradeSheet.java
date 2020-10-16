package problemandsolutions;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
    GradeSheet.scoringMethod();
    }
    public static void scoringMethod(){
        //Taking variable inputs from user with Scanner
        Scanner quizScoreInput = new Scanner(System.in);
        Scanner midtermScoreInput = new Scanner(System.in);
        Scanner finalScoreInput = new Scanner(System.in);
        Scanner studentName = new Scanner(System.in);
        Scanner studentID = new Scanner(System.in);

        System.out.println("Please Enter Student Name Below:");
        String stdName = studentName.next();

        System.out.println("What is 5 Digit student ID? ");
        int stdID = studentID.nextInt();

        System.out.println("What was students quiz score?");
        int quizScore = quizScoreInput.nextInt();

        System.out.println("What was students Mid-term score?");
        int midTerm = midtermScoreInput.nextInt();

        System.out.println("What was students Final quiz score?");
        int finalScore = finalScoreInput.nextInt();

        int average = (quizScore+midTerm+finalScore)/3;
        if (average >=90){
            System.out.println(stdName+"'s GPA is [A]");
        } else if (average >=70 && average <= 90){
            System.out.println(stdName+"'s GPA is [B]");
        } else if (average >=50 && average <= 60){
            System.out.println("Your GPA is [C]");
        } else if (average <= 50){
            System.out.println(stdName+"'s GPA is [F]");
            System.out.println("Student have failed this semester.");
        }

        //Closing Scanners
        quizScoreInput.close();
        midtermScoreInput.close();
        finalScoreInput.close();
        studentName.close();
        studentID.close();

    }

}
