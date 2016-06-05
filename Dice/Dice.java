import java.util.Random;
import java.util.Scanner;

public class Dice {
	int number;
	
	public void play() {
		Random rand = new Random();
		int diceRolled = 2 + rand.nextInt(12 - 2 + 1);
		System.out.println("Rolling dice! " + diceRolled) ;
	}
	
	public void playGame(){
		int choice;
		Scanner play = new Scanner(System.in);
		do {
		System.out.println("Do you want to play dice?");
		choice = play.nextInt();
		if(choice == 1) { 
			play();
		}else {
			play.close();
			System.out.println("Goodbye");
			System.exit(0);
		}
	  }while(choice == 1);
	}
	
	public static void main(String args[]){
		Dice roller = new Dice();
		roller.playGame();
	}
}