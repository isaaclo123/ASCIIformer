
import java.util.Scanner;

 


public class ASCIIformer {
	
	private static Scanner reader;
	
public static void main(String[] args) throws InterruptedException {

	Boolean run = true;

	reader = new Scanner(System.in);

	
	variables.level[variables.levelnum][variables.a][variables.b] = "☻";
	
	functions.titleprint();
	

	
	
	functions.print();
	
	
	
	String input = reader.nextLine();


	
	functions.clear();
	
	while (run == true){
		functions.clear();
		if (input.equals("s"))
		{
			
			
			functions.gravity();
		
			
		}
		else if (input.equals("w"))
		{
			
			if (variables.jump != 2) {
			controls.up();
			variables.jump = variables.jump + 1;
			}
			else if (variables.jump == 2) {
			
			functions.gravity();
				
			}
			
			
			
			
			
	
		}
	else if (input.equals("a"))
		{
			
		controls.left();
		
		if (variables.jump == 2){
			
			controls.left();
			
		}
		
		functions.gravity();
		
	
			
					
				
			
		}
		else if (input.equals("d"))
		{
			controls.right();
			
			if (variables.jump == 2){
				
				controls.right();
				
			}
			functions.gravity();
					
				
			
		}
		else if (input.equals("quit"))
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
			input = reader.nextLine();	
			
		}
		functions.clear();
	
	functions.print();
	
	input = reader.nextLine();
	
}
}


}

