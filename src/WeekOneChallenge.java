/*This program will have the user input a number,
 and the program will check whether or not the number is prime.
  */

import java.util.Scanner;
//Random randomNumber = new Random();   --- Will be used for option 2 of the challenge.

public class WeekOneChallenge {
    public static void main(String [] args) {


        Scanner key = new Scanner(System.in); //This line initializes the ability for the user to enter a number into a variable.


        int inputNumber;
        boolean primeChecker;
        int primeChecker1;

        do {

            System.out.println("Please input a number to check if it is prime: ");
            inputNumber = key.nextInt();

            for (int i=2; i==inputNumber; i++) {

                primeChecker = ((inputNumber % i) == 0);
                primeChecker1 = (inputNumber % i);

                if (primeChecker1 == 0) {
                    System.out.println(inputNumber + " is not a prime number.");
                } else {
                    System.out.println(inputNumber + " is a prime number.");
                }
            }
        }
            while (true) ;


    }
}
