
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        
        int randomNum;
        int guessNum = 1;
        int lastGuess;
        Random rand = new Random();
        randomNum = rand.nextInt(19) + 1;
        System.out.println("Enter a Guess answer can be any number between 1 & 20");
        Scanner userGuess = new Scanner(System.in);
        
        lastGuess = userGuess.nextInt();
        while(randomNum != lastGuess){ 
        
        if (randomNum < lastGuess){
        System.out.println("Too High Try Again");
        
        
        }else if (randomNum > lastGuess){
        System.out.println("Too Low Try Again");
        
        }
        int guess = userGuess.nextInt();
            if(guess != lastGuess) {
               guessNum = guessNum + 1;
               lastGuess = guess;
            }
        }
            System.out.println("Your Right");
            System.out.println("It took you " + guessNum + " tries");
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    }

