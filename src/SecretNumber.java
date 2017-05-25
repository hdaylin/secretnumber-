import java.util.Scanner; 
import java.util.Random;
public class SecretNumber {

	public static void main(String[] args) {
		Random r = new Random(); 
		Scanner keyboard = new Scanner (System.in); 
		
		int secret = 1+ r.nextInt(999); 
		int guess = 0; 
		String again ="Y";
		
		System.out.println("Guess the secret number"); 
		guess = keyboard.nextInt(); 
		
		
		while (guess != secret && again.equals("Y")){
		if(guess > secret){
			System.out.println("You guessed to high");
			System.out.println("Try again?");  
			again = keyboard.next();
			
		}else if (guess < secret){
			System.out.println("You guessed too low");
			System.out.println("Try again?"); 
			again = keyboard.next();
		} 
		if(again.equals("N")){
			System.out.println("Better luck next time.");
			
		}else{
		System.out.println("Guess the secret number"); 
		guess = keyboard.nextInt();  
		}
		
		}	
		if(guess == secret){
		System.out.println("You guessed it!");
		}
	
	}
}
