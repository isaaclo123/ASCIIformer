import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
import java.io.*;

 


public class TerminalConquestbackup {
	
	private static Scanner reader;
	
public static void main(String[] args) {
	int a = 1;
	int olda = 1;
	int backupa = 1;
	int b = 9;
	int oldb = 9;
	int backupb = 9;
	Boolean run = true;

	reader = new Scanner(System.in);

	String[][] display = new String[][]
	{
		{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"}
		
	};
	
	String[][] backupdisplay = new String[][]
	{
		{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "*"},
		{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"}
		
	};
	
	display[a][b] = "@";
	
	int newa = 1;
	int newb = 9;
	
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
	while (newa <= 15 & b >= 11)
	{
			a = a + 1;
			System.out.print(display[newa][newb]);
			if (a + 1 % 15 == 0)
			{
				b = b + 1;
				a = 0;
				System.out.print(display[newa][newb]);
			}
	}
	
	System.out.println("");
	
	System.out.println("Enter command");
	String input = reader.nextLine();
//while ( a != 0 || b != 0 || a != 7 || b != 7)
//{
	while (!backupdisplay[backupa][backupb].equals("#"))
	{
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
		if (input.equals("d"))
		{
			
			olda = a;
			oldb = b;
			a = a + 1;
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			backupa = a;
			backupb = b;			
	
			
		}
		else if (input.equals("a"))
		{
			
			
			olda = a;
			oldb = b;
			a = a - 1;
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			backupa = a;
			backupb = b;
	
		}
		else if (input.equals("s"))
		{
			
			
			olda = a;
			oldb = b;
			
			b = b - 1;
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			backupa = a;
			backupb = b;
			
		}
		else if (input.equals("w"))
		{
			
			
			olda = a;
			oldb = b;			
			b = b + 1;
			display[a][b] = "@";
			display[olda][oldb] = backupdisplay[olda][oldb];
			backupa = a;
			backupb = b;
			
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
	
		while (newa != 15 & b != 11)
	{
			a = a + 1;
			System.out.print(display[newa][newb]);
			if (a + 1 % 15 == 0)
			{
				b = b + 1;
				a = 0;
				System.out.print(display[newa][newb]);
			}
	}
	System.out.println("");
	System.out.println("Enter command");
	input = reader.nextLine();
	
	}
	
	System.out.println("You fail");
	System.exit(1);
}
//}

}
