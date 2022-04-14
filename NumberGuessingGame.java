import java.util.Random;
import java.util.Scanner;  //import required classes and packages   	



public class NumberGuessingGame //create NumberGuessingGame class 
	{

  
	public static void main(String[] args)	//main method starts
		{

   
		Random rand = new Random();
    //create random class object to generate random number 
		Scanner scanner = new Scanner(System.in);
 //create scanner class object to get choice of user     
    
		int randomNumber = rand.nextInt(100) + 1;
  //generate random number from 1 to 100  
		//System.out.println("Random number is " + randomNumber);
    
    
		int tryCount = 0;
 //tryCount variable to count number of tries
		int chances=5;	//chances variable to count number of chances
   
		System.out.println("Computer will pick random number from 1 to 100 and You have to guess the number.");  
		System.out.println("You have only 5 Chances."); 
		while(true) 
			{

			if(chances>=1)
			{
        
			System.out.println("Enter your guess (1-100):");
      
      
			int playerGuess = scanner.nextInt();
      //get guess number from user
			tryCount++;	//increase count by 1
			
      
			if (playerGuess == randomNumber) //compare guess number and random number
				{
        
				System.out.println("Correct! You Win!");
//if both are equal then print this message
				System.out.println("It took you " + tryCount + " tries");
				chances--;
        
				break;
      
				}
      
			else if(randomNumber > playerGuess) //compare guess number and random number
				{
        
				System.out.println("Nope! The number is higher. Guess again.");//if random number is greater than guess number then print this message
				chances--;
				System.out.println("Chances Left: "+chances);
        
				}
      
			else 	
				{
        
				System.out.println("Nope! The number is lower. Guess again.");//if random number is smaller than guess number then print this message
				chances--;

				System.out.println("Chances Left: "+chances);
           
				}

			}
		
		else
			{
			System.out.println("Out of Chances!!"); //if all 5 chances gets finish then print this message
			System.out.println("Better Luck Next Time");
			break;    
			}
		}
		

    
    
    
    
		scanner.close();
//close scanner class
  
		}

	}


		