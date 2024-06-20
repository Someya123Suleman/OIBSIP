import java.util.Scanner;
import java.util.Random;
public class guessing_game {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int lowerBound=1;
        int upperBound=100;
        int secretNumber=random.nextInt(upperBound-lowerBound+1)+lowerBound;
        int guess;
        int attempts=0;
        boolean correctGuess=false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between"+ lowerBound+" and "+upperBound+". Can you guess it?");
        while(correctGuess){
            System.out.println("Enter your guess:");
            guess=scanner.nextInt();
            attempts++;
            if(guess<secretNumber){
                System.out.println("Too low!Try a higher number.");

            }
            else if(guess>secretNumber){
                System.out.println("Too high!Try a lower number.");

            }
            else{
                System.out.println("Congratulations!You've guessed the number"+secretNumber+"correctly in"+attempts +"attempts.");
                correctGuess=true;
            }
        }
        scanner.close();
    }
}