
import java.util.Scanner;

 


public class ASCIIformer {
	
	private static Scanner reader;
	
public static void main(String[] args) throws InterruptedException {
	int a = 9;
	int olda = 9;
	int b = 1;
	int oldb = 1;
	Boolean run = true;

	reader = new Scanner(System.in);
	String[][] title = new String[][]
			
			{
				{" ","█","█","█","█","█","╗"," ","█","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗","█","█","╗","█","█","╗","█","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗"," ","█","█","█","╗"," "," "," ","█","█","█","╗","█","█","█","█","█","█","█","╗","█","█","█","█","█","█","╗"},
				{"█","█","╔","═","═","█","█","╗","█","█","╔","═","═","═","═","╝","█","█","╔","═","═","═","═","╝","█","█","║","█","█","║","█","█","╔","═","═","═","═","╝","█","█╔","═","═","═","█","█","╗","█","█","╔","═","═","█","█","╗","█","█","█","█","╗"," ","█","█","█","█","║","█","█","╔","═","═","═","═","╝","█","█","╔","═","═","█","█","╗"},
				{"█","█","█","█","█","█","█","║","█","█","█","█","█","█","█","╗","█","█","║"," "," "," "," "," ","█","█","║","█","█","║","█","█","█","█","█","╗"," "," ","█","█","║"," "," "," ","█","█","║","█","█","█","█","█","█","╔","╝","█","█","╔","█","█","█","█","╔","█","█","║","█","█","█","█","█","╗"," "," ","█","█","█","█","█","█","╔","╝"},
				{"█","█","╔","═","═","█","█","║","╚","═","═","═","═","█","█","║","█","█","║"," "," "," "," "," ","█","█","║","█","█","║","█","█","╔","═","═","╝"," "," ","█","█","║"," "," "," ","█","█","║","█","█","╔","═","═","█","█","╗","█","█","║","╚","█","█","╔","╝","█","█","║","█","█","╔","═","═","╝"," "," ","█","█","╔","═","═","█","█","╗"},
				{"█","█","║"," "," ","█","█","║","█","█","█","█","█","█","█","║","╚","█","█","█","█","█","█","╗","█","█","║","█","█","║","█","█","║"," "," "," "," "," ","╚","█","█","█","█","█","█","╔","╝","█","█","║"," "," ","█","█","║","█","█","║"," ","╚","═","╝"," ","█","█","║","█","█","█","█","█","█","█","╗","█","█","║"," "," ","█","█","║"},
				{"╚","═","╝"," "," ","╚","═","╝","╚","═","═","═","═","═","═","╝"," ","╚","═","═","═","═","═","╝","╚","═","╝","╚","═","╝","╚","═","╝"," "," "," "," "," "," ","╚","═","═","═","═","═","╝"," ","╚","═","╝"," "," ","╚","═","╝","╚","═","╝"," "," "," "," "," ","╚","═","╝","╚","═","═","═","═","═","═","╝","╚","═","╝"," "," ","╚","═","╝"},
			};

	 String[][][] level = new String[][][]
				{
				level0.display, level0.backupdisplay, level1.display, level1.backupdisplay
					
				};

	
	int levelnum = 0;
	int backuplevelnum = levelnum + 1;
	
	
	level[levelnum][a][b] = "▒";
	
	int x = 0;
	int y = 0;
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	for (x = 0; x < title.length; x++) 
    {
		Thread.sleep(3);
        for (y = 0; y < title[x].length ; y++) 
        {
        	Thread.sleep(3);
            System.out.print(title[x][y]);
        }
        System.out.println();
    }
	
	x = 0;
	y = 0;
	
	System.out.println("");

	System.out.println("COPYRIGHT © ISAAC LO 2014. ALL RIGHTS RESERVED");
	System.out.println("");
	System.out.println("PRESS ENTER TO CONTINUE...");
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
	keyboard.nextLine();
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
	for (x = 0; x < level[levelnum].length; x++) 
    {
		//Thread.sleep(5);
        for (y = 0; y < level[levelnum][x].length ; y++) 
        {
        	//Thread.sleep(5);
            System.out.print(level[levelnum][x][y]);
        }
        System.out.println();
    }
	
	x = 0;
	y = 0;
	
	System.out.println("");
	
	System.out.println("ENTER COMMAND:");
	String input = reader.nextLine();


	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	while (run == true){
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		if (input.equals("s"))
		{
			
			olda = a;
			oldb = b;
			
				a = a + 1;
			
			if (level[levelnum][a][b].equals("█"))
			{
				a = a - 1;
				olda = a - 1;
				
			}
			
			level[levelnum][a][b] = "▒";
			level[levelnum][olda][oldb] = level[backuplevelnum][olda][oldb];
			backuplevelnum = levelnum + 1;
			
			
			
		}
		else if (input.equals("w"))
		{
			
			
			olda = a;
			oldb = b;
			
				a = a - 1;
			
			if (level[levelnum][a][b].equals("█"))
			{
				a = a + 1;
				olda = a + 1;
				
			}
			
			level[levelnum][a][b] = "▒";
			level[levelnum][olda][oldb] = level[backuplevelnum][olda][oldb];
			backuplevelnum = levelnum + 1;
			
			
			
	
		}
		else if (input.equals("a"))
		{
			
			
			olda = a;
			oldb = b;
			
				b = b - 1;
			
			if (level[levelnum][a][b].equals("█"))
			{
				b = b + 1;
				oldb = b + 1;
				
			}
			if (b == 0)
			{
				b = b + 1;
				oldb = oldb + 1;
				
			}
			
			level[levelnum][a][b] = "▒";
			level[levelnum][olda][oldb] = level[backuplevelnum][olda][oldb];
			backuplevelnum = levelnum + 1;
			
			
		}
		else if (input.equals("d"))
		{
			
			
			olda = a;
			oldb = b;
			
				b = b + 1;
			
			if (level[levelnum][a][b].equals("█"))
			{
				b = b - 1;
				oldb = b - 1;
				
			}
			
			if (b == (level[levelnum][a].length - 1)){
				b = 1;
				levelnum = levelnum + 2;
			}
			level[levelnum][a][b] = "▒";
			level[levelnum][olda][oldb] = level[backuplevelnum][olda][oldb];
			backuplevelnum = levelnum + 1;
			
		}
		else if (input.equals("quit"))
		{
			System.exit(1);
		}
		else
		{
			System.out.println("");
			System.out.println("NOT A VALID COMMAND.");
			System.out.println("ENTER COMMAND:");
			input = reader.nextLine();	
			
		}
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
	for (x = 0; x < level[levelnum].length; x++) 
    {
		//Thread.sleep(5);
        for (y = 0; y < level[levelnum][x].length ; y++) 
        {
        	//Thread.sleep(5);
            System.out.print(level[levelnum][x][y]);
        }
        System.out.println();
    }
	
	x = 0;
	y = 0;
	System.out.println("");
	System.out.println("ENTER COMMAND:");
	input = reader.nextLine();
	
}
}

}
