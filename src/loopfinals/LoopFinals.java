/*
 * This program offers the user the choice of 4 options
 * 1 - find the value of a given number squared. 2. Find the value of a given number cubed.  
 * 3- Find the power of a base raised to some exponent 4. Exit
 * Uses a loop to allow the user to return to the main menu until they would like to exit the program
 * Made by Tarkan Dahi on the Eleventh of March, 2020
*/

package loopfinals;
import java.util.Scanner;
/**
 *
 * @author TaDah5199
 */
public class LoopFinals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variable declaration area
        Scanner keyedInput = new Scanner(System.in);    
        int option = 0;
        
        int squaredNum;
        int squaredNumAnswer = 1;
        
        int cubedNum;
        int cubedNumAnswer = 1;
        
        int baseNum;
        int exponentNum;
        int power = 1;
        
    
        // This checks if the user would like to choose a calculator, or exit the program
        do
        {
        System.out.println("Program Guide \nPlease choose one of the following options");
        System.out.println("1… Find the value of a number squared");
        System.out.println("2… Find the value of a number cubed");
        System.out.println("3… Find the value of a number, to any power");
        System.out.println("4… Exit");
        
        option = keyedInput.nextInt();
        
        System.out.println("");
        if (option == 1)
        {
            System.out.println("You chose to find the value of a number squared");
            System.out.println("Please input your number");
            
            squaredNum = keyedInput.nextInt();
            
            for (int i=1;i<=2;i++)
            { 
            squaredNumAnswer = squaredNumAnswer * squaredNum;
            }
            System.out.println(squaredNum + " squared is: " + squaredNumAnswer);
            System.out.println(""); // Just to make the program easier to read
            squaredNumAnswer = 1; // To make sure the program resets back to normal if the user wants to reuse it in the same run
        }
        
        else if (option == 2)
        {
            System.out.println("You chose to find the value of a number cubed");
            System.out.println("Please input your number");
            
            cubedNum = keyedInput.nextInt();
            
            for (int i=1;i<=3;i++)
            { 
            cubedNumAnswer = cubedNumAnswer * cubedNum;
            }
            
            System.out.println(cubedNum + " cubed is: " + cubedNumAnswer);
            System.out.println(""); // Just to make the program easier to read
            cubedNumAnswer = 1; // To make sure the program resets back to normal if the user wants to reuse it in the same run
        }
        
        else if (option == 3)
        {
            System.out.println("You chose to find the value of a power");
            System.out.println("Please input your base");
            
            baseNum = keyedInput.nextInt();
            
            System.out.println("Please input the exponent on the base");
            exponentNum = keyedInput.nextInt();
            
            
            for (int i=1;i<=exponentNum;i++)
            {
            power = power * baseNum;
            }
            System.out.println(baseNum +" to the Exponent " + exponentNum + " is equal to " + power);
            System.out.println(""); // Just to make the program easier to read
            power = 1; // To make sure the program resets back to normal if the user wants to reuse it in the same run
            }
        } while (option != 4);
        
        
        do 
        {
            System.out.println("Goodbye!");  
            option = 5;
        } while (option == 4);
        // This final choice allows the user to leave, and closes the loop until the program is rerun.
        }    
        
        
        
}

