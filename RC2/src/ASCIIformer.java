import java.io.FileOutputStream;
import java.util.Scanner;

 


public class ASCIIformer {
	
	private static Scanner reader;
	
public static void main(String[] args) throws InterruptedException {
	int a = 9;
	int olda = 9;
	int b = 0;
	int oldb = 0;
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

	 String[][] display = new String[][]
				{
					{"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", "█", "█", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", " ", " "},
					{" ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"}
					
				};
				
			
	String[][] backupdisplay = new String[][]
				{
					{"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", "█", "█", "█", "█", "█", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "█"},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", " ", " ", " ", "█", "█", " ", " ", " ", " ", " "},
					{" ", " ", " ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", " ", " "},
					{" ", " ", " ", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
					{"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"}
					
				};
	
	
	display[a][b] = "▒";
	
	int x = 0;
	int y = 0;
	
	for (x = 0; x < title.length; x++) 
    {
		Thread.sleep(5);
        for (y = 0; y < title[x].length ; y++) 
        {
        	Thread.sleep(5);
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
	
	for (x = 0; x < display.length; x++) 
    {
		Thread.sleep(5);
        for (y = 0; y < display[x].length ; y++) 
        {
        	Thread.sleep(5);
            System.out.print(display[x][y]);
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
			
			if (display[a][b].equals("█"))
			{
				a = a - 1;
				olda = a - 1;
				
			}
			display[a][b] = "▒";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
			
		}
		else if (input.equals("w"))
		{
			
			
			olda = a;
			oldb = b;
			a = a - 1;
			
			if (display[a][b].equals("█"))
			{
				a = a + 1;
				olda = a + 1;
				
			}
			display[a][b] = "▒";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
			
	
		}
		else if (input.equals("a"))
		{
			
			
			olda = a;
			oldb = b;
			b = b - 1;
			
			if (display[a][b].equals("█"))
			{
				b = b + 1;
				oldb = b + 1;
				
			}
		display[a][b] = "▒";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
		}
		else if (input.equals("d"))
		{
			
			
			olda = a;
			oldb = b;			
			b = b + 1;
			
			if (display[a][b].equals("█"))
			{
				b = b - 1;
				oldb = b - 1;
				
			}
			display[a][b] = "▒";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
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
	
		for (x = 0; x < display.length; x++) 
    {
			Thread.sleep(5);
        for ( y = 0; y < display[x].length ; y++) 
        {
        	Thread.sleep(5);
            System.out.print(display[x][y]);
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

