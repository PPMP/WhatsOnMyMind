import java.util.Scanner;

public class Dice {
	int number;
	
	public void play() {
		
	}
	
	public void playGame(){
		int choice;
		Scanner play = new Scanner(System.in);
		System.out.println("Do you want to play dice?");
		choice = play.nextInt();
		if(choice == 1) { 
			play();
		}else {
			play.close();
			System.out.println("Goodbye");
			System.exit(0);
		}
	}
	
	public static void main(String args[]){

	}
}