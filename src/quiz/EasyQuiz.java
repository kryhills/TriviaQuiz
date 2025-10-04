package src.quiz;
import java.util.Scanner;

public class EasyQuiz {
    public static void main(String[] args) {


        Scanner MainObj = new Scanner(System.in);
        int score = 0;
        
        int answer1;
        System.out.print("How many months are in a year? ");
        answer1 = MainObj.nextInt();

        if (answer1 == 12) {
            System.out.println(" ");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        } 
            else {
            System.out.println(" ");
            System.out.println("Wrong answer you lost.");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.exit(0);
        }
        
        char decision;
        System.out.println(" ");
        System.out.print("your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        decision = MainObj.next().charAt(0);
        MainObj.nextLine();

        if (decision == 'y' || decision == 'Y') {
            System.out.println(" ");
            System.out.println("continuing to the next question...");
        }   else {
            System.out.println(" ");
            System.out.println("you chose to quit and finished with a score of: " + score);
            System.exit(0);
        }

        String answer2;
        System.out.print("What is the capital of the united states? ");
        answer2 = MainObj.nextLine();
        String normalized = answer2.replaceAll("[^a-zA-Z ]", "").toUpperCase();

        if (normalized.equals("WASHINGTON DC")) {
            System.out.println(" ");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println(" ");
            System.out.println("Wrong answer you lost.");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.exit(0);
        }

        System.out.println(" ");
        System.out.print("your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        decision = MainObj.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println(" ");
            System.out.println("continuing to the next question...");
        }   else {
            System.out.println(" ");
            System.out.println("you chose to quit and finished with a score of: " + score);
            System.exit(0);
        }

        char answer3;
        System.out.println(" ");
        System.out.println("Which planet is known as the red planet?");
        System.out.println("A) Venus");
        System.out.println("B) Mars");
        System.out.println("C) Jupiter");
        System.out.println("D) Mercury");
        System.out.print(" ");
        answer3 = MainObj.next().charAt(0);
        MainObj.nextLine();

        if (answer3 == 'B' || answer3 == 'b') {
            System.out.println(" ");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println(" ");
            System.out.println("Wrong answer you lost.");
            score -= 1;
            System.out.println("You ended the game with a score of: " + score);
            System.exit(0);
        }


        MainObj.close();
    }
}