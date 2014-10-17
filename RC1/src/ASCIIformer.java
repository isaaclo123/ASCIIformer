import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
import java.io.*;

 


public class ASCIIformer {
	
	private static Scanner reader;
	
public static void main(String[] args) {
	int a = 9;
	int olda = 9;
	int b = 1;
	int oldb = 1;
	Boolean run = true;

	reader = new Scanner(System.in);

	String[][] display = new String[][]
	{
		{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", " ", " "},
		{" ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}
		
	};
	
	String[][] backupdisplay = new String[][]
	{
		{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", "#", "#", "#", "#", "#", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", " ", " "},
		{" ", " ", " ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", " ", " "},
		{" ", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}
		
	};
	
	display[a][b] = "@";
	
	int x = 0;
	int y = 0;
	
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
	for (x = 0; x < display.length; x++) 
    {
        for (y = 0; y < display[x].length ; y++) 
        {
            System.out.print(display[x][y]);
        }
        System.out.println();
    }
	
	x = 0;
	y = 0;
	
	System.out.println("");
	
	System.out.println("Enter command");
	String input = reader.nextLine();


	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	while (run == true){
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		if (input.equals("s"))
		{
			
			olda = a;
			oldb = b;
			
				a = a + 1;
			
			if (display[a][b].equals("#"))
			{
				a = a - 1;
				olda = a - 1;
				
			}
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
			
		}
		else if (input.equals("w"))
		{
			
			
			olda = a;
			oldb = b;
			a = a - 1;
			
			if (display[a][b].equals("#"))
			{
				a = a + 1;
				olda = a + 1;
				
			}
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
			
	
		}
		else if (input.equals("a"))
		{
			
			
			olda = a;
			oldb = b;
			b = b - 1;
			
			if (display[a][b].equals("#"))
			{
				b = b + 1;
				oldb = b + 1;
				
			}
		display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
		}
		else if (input.equals("d"))
		{
			
			
			olda = a;
			oldb = b;			
			b = b + 1;
			
			if (display[a][b].equals("#"))
			{
				b = b - 1;
				oldb = b - 1;
				
			}
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			
			
			
		}
		else if (input.equals("quit"))
		{
			System.exit(1);
		}
		else
		{
			System.out.println("");
			System.out.println("Not a valid command.");
			System.out.println("Enter a valid command");
			input = reader.nextLine();	
			
		}
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
		for (x = 0; x < display.length; x++) 
    {
        for ( y = 0; y < display[x].length ; y++) 
        {
            System.out.print(display[x][y]);
        }
        System.out.println();
    }
	x = 0;
	y = 0;
	System.out.println("");
	System.out.println("Enter command");
	input = reader.nextLine();
	
}
}

}
