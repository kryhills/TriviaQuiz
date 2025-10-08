package src.quiz;
import java.util.Scanner;

public class MediumQuiz {
    public static void main(String[] args) {

        Scanner MainObj1 = new Scanner(System.in);
        int score = 0;

        String answer1;
        System.out.println("-----------------------------");
        System.out.println("Loading Medium difficulty quiz...");
        System.out.println("----------- RULES -----------");
        System.out.println("You must answer questions with a single letter");
        System.out.println("For example if the answer is C you must only type 'c'");
        System.out.println("The answers are NOT case sensitive");
        System.out.println("-----------------------------");
        System.out.println("What is the capital of Australia? ");
        System.out.println("A) Sydney");
        System.out.println("B) Wellington");
        System.out.println("C) Auckland");
        System.out.println("D) Christchurch");
        System.out.print("answer: ");
        answer1 = MainObj1.nextLine();

        if (answer1.equalsIgnoreCase("b")) {
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
        decision = MainObj1.next().charAt(0);
        MainObj1.nextLine();

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
        System.out.println("Who painted 'The persistence of Memory'?");
        System.out.println("A) Pablo Picasso");
        System.out.println("B) Claude Monet");
        System.out.println("C) Salvador Dali");
        System.out.println("D) Vincent Van Gogh");
        System.out.print("answer: ");
        answer2 = MainObj1.nextLine();

        if (answer2.equalsIgnoreCase("c")) {
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
        decision = MainObj1.next().charAt(0);

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
        System.out.println("What year did World War II end?");
        System.out.println("A) 1943");
        System.out.println("B) 1944");
        System.out.println("C) 1945");
        System.out.println("D) 1946");
        System.out.print("answer: ");
        answer3 = MainObj1.nextLine();
        answer3 = MainObj1.nextLine();

        if (answer3.equalsIgnoreCase("c")) {
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
        decision = MainObj1.next().charAt(0);

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
        System.out.println("Who wrote the novel '1984'?");
        System.out.println("A) Aldous Huxley");
        System.out.println("B) George Orwell");
        System.out.println("C) J.D. Salinger");
        System.out.println("D) Ray Bradbury");
        System.out.print("answer: ");
        answer4 = MainObj1.nextLine();
        answer4 = MainObj1.nextLine();

        if (answer4.equalsIgnoreCase("b")) {
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
        MainObj1.next().charAt(0);

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
        System.out.println("The Great Barrier Reef is located in which country?");
        System.out.println("A) Indonesia");
        System.out.println("B) Australia");
        System.out.println("C) South Africa");
        System.out.println("D) Philippines");
        System.out.print("answer: ");
        answer5 = MainObj1.nextLine();
        answer5 = MainObj1.nextLine();

        if (answer5.equalsIgnoreCase("b")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj1.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer6;
        System.out.println("-----------------------------");
        System.out.println("What is the chemical symbol for gold?");
        System.out.println("A) Ag");
        System.out.println("B) Gd");
        System.out.println("C) Au");
        System.out.println("D) Go");
        System.out.print("answer: ");
        answer6 = MainObj1.nextLine();
        answer6 = MainObj1.nextLine();

        if (answer6.equalsIgnoreCase("c")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj1.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer7;
        System.out.println("-----------------------------");
        System.out.println("Which language has the most native speakers in the world?");
        System.out.println("A) English");
        System.out.println("B) Spanish");
        System.out.println("C) Mandarin Chinese");
        System.out.println("D) Hindi");
        System.out.print("answer: ");
        answer7 = MainObj1.nextLine();
        answer7 = MainObj1.nextLine();

        if (answer7.equalsIgnoreCase("c")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj1.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer8;
        System.out.println("-----------------------------");
        System.out.println("Which continent is the Sahara Desert located on?");
        System.out.println("A) Asia");
        System.out.println("B) Africa");
        System.out.println("C) North America");
        System.out.println("D) Australia");
        System.out.print("answer: ");
        answer8 = MainObj1.nextLine();
        answer8 = MainObj1.nextLine();

        if (answer8.equalsIgnoreCase("b")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj1.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer9;
        System.out.println("-----------------------------");
        System.out.println("Who developed the theory of general relativity?");
        System.out.println("A) Isaac Newton");
        System.out.println("B) Nikola Tesla");
        System.out.println("C) Albert Einstein");
        System.out.println("D) Stephen Hawking");
        System.out.print("answer: ");
        answer9 = MainObj1.nextLine();
        answer9 = MainObj1.nextLine();

        if (answer9.equalsIgnoreCase("c")) {
            System.out.println("-----------------------------");
            System.out.println("Correct answer! adding 1 point to your score...");
            score += 1;
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        System.out.println("-----------------------------");
        System.out.print("Your current score is " + score + " would you like to continue? (if you get the next question wrong you are eliminated) [y / n] ");
        MainObj1.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            System.out.println("-----------------------------");
            System.out.println("Continuing to the final question...");
        }   else {
            System.out.println("-----------------------------");
            System.out.println("You chose to quit and finished with a score of: " + score);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        String answer10;
        System.out.println("-----------------------------");
        System.out.println("The Taj Mahal was built during the reign of which Mughal emperor?");
        System.out.println("A) Akbar");
        System.out.println("B) Shah Jahan");
        System.out.println("C) Aurangzeb");
        System.out.println("D) Babur");
        System.out.print("answer: ");
        answer10 = MainObj1.nextLine();
        answer10 = MainObj1.nextLine();

        if (answer10.equalsIgnoreCase("b")) {
            score += 1;
            System.out.println("-----------------------------");
            System.out.println("Correct answer! you completed the Easy Difficulty quiz with a score of 10/10");
            System.exit(0);
        }   else {
            System.out.println("-----------------------------");
            System.out.println("Wrong answer you lost.");
            System.out.println("-----------------------------");
            score -= 1;
            System.exit(0);
        }

        MainObj1.close();
    }
}
