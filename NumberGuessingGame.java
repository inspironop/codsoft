import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange= 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game ! :) ");

        while(true) {
            int tragetNumber= random.nextInt(maxRange-minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I'm thinking of a no. between " + minRange + " and " + maxRange + "." );
            System.out.println("You have"+ maxAttempts + " attempts to guess it.");

            while (attempts< maxAttempts){
                System.out.println("Enter your guess");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == tragetNumber) {
                    System.out.println("Congrats! You guessed the correct number in " + attempts + "attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < tragetNumber) {
                    System.out.println("Too low. Try again.");
                }
                else {
                    System.out.println("Too high.try again.");
                }

            }

if (!guessedCorrectly){
    System.out.println("Sorry,you've run out of attempts. The correct number was"+tragetNumber + ".");
}
            System.out.println("Your current score:" + score);
            System.out.println("Do you want to play again? (yes/no):");
            String playAgain= scanner.next().toLowerCase();

            if (!playAgain.equals("yes")){
                System.out.println("Thanks for playing! Your final score:" + score);
                break;
            }
        }
          scanner.close();
    }




}