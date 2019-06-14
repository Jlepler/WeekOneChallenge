/*This program will have the user input a number,
 and the program will check whether or not the number is prime.
  */

import java.util.Scanner;
import java.util.Random;


public class WeekOneChallenge {
    public static void main(String[] args) {

        Random randomNumber = new Random();   // Will be used for option 2 of the challenge.

        Scanner key = new Scanner(System.in); //This line initializes the ability for the user to enter a number into a variable.


        int inputNumber;
        int randomInput = randomNumber.nextInt((250) + 1);
        int primeChecker1;
        int primeChecker2;
        String answer;

        System.out.println("Would you like to generate a random number? Y/N");
        answer = key.next();

        if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {

            do {
                System.out.println("Input a number");
                inputNumber = key.nextInt();

                for (int i = 2; i <= (inputNumber / 2); i++) {
                    primeChecker1 = inputNumber % i;

                    if (primeChecker1 == 0) {
                        System.out.println(inputNumber + " is not a prime number.");
                        break;
                    } else if (i == (inputNumber / 2)) {
                        System.out.println(inputNumber + " is a prime number.");
                        break;
                    } else
                        ;
                }
            } while (true);
        } else {



            do {
                System.out.println("Generating a random number...");
                for (int i = 2; i <= (randomInput / 2); i++) {

                    primeChecker2 = (randomInput % 1);

                    if (primeChecker2 == 0) {
                        System.out.println(randomInput + " is not a prime number");
                        break;
                    } else if (i == (randomInput / 2)) {
                        System.out.println(randomInput + " is a prime number.");
                        break;
                    } else
                        ;

                }

            } while (true);
        }

    }
}