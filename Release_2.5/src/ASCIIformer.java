
import java.util.Scanner;

 


public class ASCIIformer {
	
	public static controls move = new controls();
	
	private static Scanner reader;
	
@SuppressWarnings("static-access")
public static void main(String[] args) throws InterruptedException {

	Boolean run = true;

	reader = new Scanner(System.in);
	
	move.a = 9;
	move.b = 1;

	
	
	variables.level[variables.levelnum][move.a][move.b] = "☻";
	
	functions.titleprint();
	
	
	
	
	functions.print();
	
	
	
	variables.input = reader.nextLine();

	
	
	functions.clear();
	
	while (run == true){
		functions.clear();
		if (variables.input.equals("s"))
		{
			
			
			functions.gravity();
		
			
		}
		else if (variables.input.equals("w"))
		{
			
			if (variables.jump != 2) {
				move.movement("up", "☻", true);
			variables.jump = variables.jump + 1;
			}
			else if (variables.jump == 2) {
			
			functions.gravity();
				
			}
			
			
			
			
			
			
	
		}
	else if (variables.input.equals("a"))
		{
			
		move.movement("left", "☻", true);
		
		if (variables.jump == 2){
			
			move.movement("left", "☻", true);
			
		}
		
		functions.gravity();
		
	
			
					
				
			
		}
		else if (variables.input.equals("d"))
		{
			move.movement("right", "☻", true);
			
			if (variables.jump == 2){
				
				move.movement("right", "☻", true);
				
			}
			functions.gravity();
					
			
			
		}
		else if (variables.input.equals("quit"))
		{
			System.exit(1);
		}

		else
		{
			System.out.print("HP:");
			System.out.print(variables.hp);
			System.out.print(" LIVES:");
			System.out.println(variables.life);
			System.out.print("SCORE:");
			System.out.println(variables.score);
			System.out.println("");
			System.out.println("NOT A VALID COMMAND.");
			System.out.println("ENTER COMMAND:");
			variables.input = reader.nextLine();	
			
		}
		functions.clear();
	
	functions.print();
	
	variables.input = reader.nextLine();
	
}
}


}

