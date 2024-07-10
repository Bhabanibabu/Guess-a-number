package Assignment_InternPE;

import java.util.Random;
import java.util.Scanner;

public class Guess_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
        int numberToGuess= random.nextInt(100) + 1;
        int numberOfTries= 0;
        boolean hasGuessedCorrectly=false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess a number between 1 and 100.");

        while (!hasGuessedCorrectly){
            System.out.print("Enter your guess: ");
            int userGuess=sc.nextInt();

            if(userGuess < 1 || userGuess > 100){
                System.out.println("Invalid guess. Try a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            }else {
                hasGuessedCorrectly=true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries. ");
            }
        }
        sc.close();
    }
}
