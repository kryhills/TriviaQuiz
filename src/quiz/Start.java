package src.quiz;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner difficultySelection = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Welcome to my quiz!");
        System.out.println("-----------------------------");
        System.out.println("Please select a difficulty!");
        System.out.println("-----------------------------");
        System.out.println("1) Easy Difficulty");
        System.out.println("2) Medium Difficulty");
        System.out.println("3) Hard Difficulty");
        System.out.println("-----------------------------");
        System.out.print("Enter choice: ");
        int choice = difficultySelection.nextInt();

        switch (choice) {
            case 1:
                EasyQuiz.main(new String[0]);
                break;
            case 2:
                MediumQuiz.main(new String[0]);
                break;
            case 3:
                System.out.println("Hard Quiz not implemented yet.");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        difficultySelection.close();
    }
}