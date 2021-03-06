import java.util.Scanner;

public class DinoBattle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("T-Rex vs. Triceratops");
		System.out.println("Enter your move to battle");
		
		String[] moves = {"Bite", "Punch"};
		String input = scan.nextLine();
		
		int trex = 100;
		int tri = 100;
		
		System.out.println(input);
		
		if(input.equalsIgnoreCase(moves[0])) {
			System.out.println("You bit the Triceratops");
			tri = tri - 60;
		} else if (input.equalsIgnoreCase(moves[1])) {
			System.out.println("You punched the Triceratops");
			tri = tri - 20;
		}
		
		System.out.println("Triceratops HP: " + tri);
		
		

	}

}
