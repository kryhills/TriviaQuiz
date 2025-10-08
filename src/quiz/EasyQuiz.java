package src.quiz;
import java.util.Scanner;

public class EasyQuiz {
    public static void main(String[] args) {

        Scanner MainObj = new Scanner(System.in);
        int score = 0;
        
        String answer1;
        System.out.println("-----------------------------");
        System.out.println("Loading Easy difficulty quiz...");
        System.out.println("----------- RULES -----------");
        System.out.println("You must answer questions with a single letter");
        System.out.println("For example if the answer is C you must only type 'c'");
        System.out.println("The answers are NOT case sensitive");
        System.out.println("-----------------------------");
        System.out.println("How many months are in a year? ");
        System.out.println("A) 10 ");
        System.out.println("B) 4");
        System.out.println("C) 12 ");
        System.out.println("D) 6 ");
        System.out.print("answer: ");
        answer1 = MainObj.nextLine();

        if (answer1.equalsIgnoreCase("c")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        } 
            else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            score -= 0;
            System.out.println("You ended the game with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }
        
        char decision;
        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        decision = MainObj.next().charAt(0);
        MainObj.nextLine();

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the next question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer2;
        System.out.println("-----------------------------");
        System.out.println("What is the capital of the united states? ");
        System.out.println("A) New York");
        System.out.println("B) Chicago");
        System.out.println("C) Los Angeles");
        System.out.println("D) Washington D.C.");
        System.out.print("answer: ");
        answer2 = MainObj.nextLine();
        String normalized = answer2.replaceAll("[^a-zA-Z ]", "").toUpperCase();

        if (normalized.equalsIgnoreCase("d")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        decision = MainObj.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the next question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer3;
        System.out.println("-----------------------------");
        System.out.println("Which planet is known as the red planet?");
        System.out.println("A) Venus");
        System.out.println("B) Mars");
        System.out.println("C) Jupiter");
        System.out.println("D) Mercury");
        System.out.print("answer: ");
        answer3 = MainObj.nextLine();
        answer3 = MainObj.nextLine();

        if (answer3.equalsIgnoreCase("B") || answer3.equalsIgnoreCase("Mars")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        decision = MainObj.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the next question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer4;
        System.out.println("-----------------------------");
        System.out.println("Which animal is known as the 'king of the jungle'?");
        System.out.println("A) Lion");
        System.out.println("B) Tiger");
        System.out.println("C) Elephant");
        System.out.println("D) Gorilla");
        System.out.print("answer: ");
        answer4 = MainObj.nextLine();
        answer4 = MainObj.nextLine();

        if (answer4.equalsIgnoreCase("tiger") || answer4.equalsIgnoreCase("b")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer5;
        System.out.println("-----------------------------");
        System.out.println("What is H20 commonly known as?");
        System.out.println("A) Salt");
        System.out.println("B) Water");
        System.out.println("C) Sugar");
        System.out.println("D) Oxygen");
        System.out.print("answer: ");
        answer5 = MainObj.nextLine();
        answer5 = MainObj.nextLine();

        if (answer5.equalsIgnoreCase("b")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! you completed the Easy Difficulty quiz with a score of 5/5");
            System.out.println("Good Job!");
            System.out.println("-----------------------------");
            System.exit(0);
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        MainObj.close();
    }
}