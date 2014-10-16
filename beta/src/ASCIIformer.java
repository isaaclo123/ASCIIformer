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
	int a = 0;
	int olda = 0;
	int backupa = 0;
	int b = 2;
	int oldb = 2;
	int backupb = 2;
	Boolean run = true;

	reader = new Scanner(System.in);

	String[][] display = new String[9][9];
	display[0][8] =  "#"; display[1][8] =  "#"; display[2][8] =  "#"; display[3][8] =  "#"; display[4][8] =  "#"; display[5][8] =  "#"; display[6][8] =  "#"; display[7][8] =  "#"; display[8][8] =  "#";
	display[0][7] =  " "; display[1][7] =  " "; display[2][7] =  " "; display[3][7] =  " "; display[4][7] =  " "; display[5][7] =  "#"; display[6][7] =  "#"; display[7][7] =  "#"; display[8][7] =  "#";
	display[0][6] =  " "; display[1][6] =  " "; display[2][6] =  " "; display[3][6] =  " "; display[4][6] =  " "; display[5][6] =  " "; display[6][6] =  " "; display[7][6] =  " "; display[8][6] =  " ";
	display[0][5] =  " "; display[1][5] =  " "; display[2][5] =  " "; display[3][5] =  " "; display[4][5] =  " "; display[5][5] =  " "; display[6][5] =  " "; display[7][5] =  " "; display[8][5] =  " ";
	display[0][4] =  " "; display[1][4] =  " "; display[2][4] =  " "; display[3][4] =  " "; display[4][4] =  " "; display[5][4] =  " "; display[6][4] =  " "; display[7][4] =  " "; display[8][4] =  " ";
	display[0][3] =  " "; display[1][3] =  " "; display[2][3] =  " "; display[3][3] =  " "; display[4][3] =  " "; display[5][3] =  " "; display[6][3] =  " "; display[7][3] =  "#"; display[8][3] =  "#";
	display[0][2] =  " "; display[1][2] =  " "; display[2][2] =  " "; display[3][2] =  " "; display[4][2] =  " "; display[5][2] =  "#"; display[6][2] =  "#"; display[7][2] =  "#"; display[8][2] =  "#";
	display[0][1] =  "#"; display[1][1] =  "#"; display[2][1] =  "#"; display[3][1] =  "#"; display[4][1] =  "#"; display[5][1] =  "#"; display[6][1] =  "#"; display[7][1] =  "#"; display[8][1] =  "#";
	display[0][0] =  "#"; display[1][0] =  "#"; display[2][0] =  "#"; display[3][0] =  "#"; display[4][0] =  "#"; display[5][0] =  "#"; display[6][0] =  "#"; display[7][0] =  "#"; display[8][0] =  "#";
	
	String[][] backupdisplay = new String[9][9];
	backupdisplay[0][8] =  "#"; backupdisplay[1][8] =  "#"; backupdisplay[2][8] =  "#"; backupdisplay[3][8] =  "#"; backupdisplay[4][8] =  "#"; backupdisplay[5][8] =  "#"; backupdisplay[6][8] =  "#"; backupdisplay[7][8] =  "#"; backupdisplay[8][8] =  "#";
	backupdisplay[0][7] =  " "; backupdisplay[1][7] =  " "; backupdisplay[2][7] =  " "; backupdisplay[3][7] =  " "; backupdisplay[4][7] =  " "; backupdisplay[5][7] =  "#"; backupdisplay[6][7] =  "#"; backupdisplay[7][7] =  "#"; backupdisplay[8][7] =  "#";
	backupdisplay[0][6] =  " "; backupdisplay[1][6] =  " "; backupdisplay[2][6] =  " "; backupdisplay[3][6] =  " "; backupdisplay[4][6] =  " "; backupdisplay[5][6] =  " "; backupdisplay[6][6] =  " "; backupdisplay[7][6] =  " "; backupdisplay[8][6] =  " ";
	backupdisplay[0][5] =  " "; backupdisplay[1][5] =  " "; backupdisplay[2][5] =  " "; backupdisplay[3][5] =  " "; backupdisplay[4][5] =  " "; backupdisplay[5][5] =  " "; backupdisplay[6][5] =  " "; backupdisplay[7][5] =  " "; backupdisplay[8][5] =  " ";
	backupdisplay[0][4] =  " "; backupdisplay[1][4] =  " "; backupdisplay[2][4] =  " "; backupdisplay[3][4] =  " "; backupdisplay[4][4] =  " "; backupdisplay[5][4] =  " "; backupdisplay[6][4] =  " "; backupdisplay[7][4] =  " "; backupdisplay[8][4] =  " ";
	backupdisplay[0][3] =  " "; backupdisplay[1][3] =  " "; backupdisplay[2][3] =  " "; backupdisplay[3][3] =  " "; backupdisplay[4][3] =  " "; backupdisplay[5][3] =  " "; backupdisplay[6][3] =  " "; backupdisplay[7][3] =  "#"; backupdisplay[8][3] =  "#";
	backupdisplay[0][2] =  " "; backupdisplay[1][2] =  " "; backupdisplay[2][2] =  " "; backupdisplay[3][2] =  " "; backupdisplay[4][2] =  " "; backupdisplay[5][2] =  "#"; backupdisplay[6][2] =  "#"; backupdisplay[7][2] =  "#"; backupdisplay[8][2] =  "#";
	backupdisplay[0][1] =  "#"; backupdisplay[1][1] =  "#"; backupdisplay[2][1] =  "#"; backupdisplay[3][1] =  "#"; backupdisplay[4][1] =  "#"; backupdisplay[5][1] =  "#"; backupdisplay[6][1] =  "#"; backupdisplay[7][1] =  "#"; backupdisplay[8][1] =  "#";
	backupdisplay[0][0] =  "#"; backupdisplay[1][0] =  "#"; backupdisplay[2][0] =  "#"; backupdisplay[3][0] =  "#"; backupdisplay[4][0] =  "#"; backupdisplay[5][0] =  "#"; backupdisplay[6][0] =  "#"; backupdisplay[7][0] =  "#"; backupdisplay[8][0] =  "#";
	
	
	display[a][b] = "@";
	
	
	String line1 = display[0][8] +  display[1][8] +  display[2][8] +  display[3][8] +  display[4][8] +  display[5][8] +  display[6][8] +  display[7][8] + display[8][8];
	String line2 = display[0][7] +  display[1][7] +  display[2][7] +  display[3][7] +  display[4][7] +  display[5][7] +  display[6][7] +  display[7][7] + display[8][7];
	String line3 = display[0][6] +  display[1][6] +  display[2][6] +  display[3][6] +  display[4][6] +  display[5][6] +  display[6][6] +  display[7][6] + display[8][6];
	String line4 = display[0][5] +  display[1][5] +  display[2][5] +  display[3][5] +  display[4][5] +  display[5][5] +  display[6][5] +  display[7][5] + display[8][5];
	String line5 = display[0][4] +  display[1][4] +  display[2][4] +  display[3][4] +  display[4][4] +  display[5][4] +  display[6][4] +  display[7][4] + display[8][4];
	String line6 = display[0][3] +  display[1][3] +  display[2][3] +  display[3][3] +  display[4][3] +  display[5][3] +  display[6][3] +  display[7][3] + display[8][3];
	String line7 = display[0][2] +  display[1][2] +  display[2][2] +  display[3][2] +  display[4][2] +  display[5][2] +  display[6][2] +  display[7][2] + display[8][2];
	String line8 = display[0][1] +  display[1][1] +  display[2][1] +  display[3][1] +  display[4][1] +  display[5][1] +  display[6][1] +  display[7][1] + display[8][1];
	String line9 = display[0][0] +  display[1][0] +  display[2][0] +  display[3][0] +  display[4][0] +  display[5][0] +  display[6][0] +  display[7][0] + display[8][0];
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
	System.out.println(line1);
	System.out.println(line2);
	System.out.println(line3);
	System.out.println(line4);
	System.out.println(line5);
	System.out.println(line6);
	System.out.println(line7);
	System.out.println(line8);
	System.out.println(line9);
	System.out.println("");
	
	System.out.println("Enter command");
	String input = reader.nextLine();
while ( a != 0 || b != 0 || a != 7 || b != 7)
{
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
		 line1 = display[0][8] +  display[1][8] +  display[2][8] +  display[3][8] +  display[4][8] +  display[5][8] +  display[6][8] +  display[7][8] + display[8][8];
	 line2 = display[0][7] +  display[1][7] +  display[2][7] +  display[3][7] +  display[4][7] +  display[5][7] +  display[6][7] +  display[7][7] + display[8][7];
	 line3 = display[0][6] +  display[1][6] +  display[2][6] +  display[3][6] +  display[4][6] +  display[5][6] +  display[6][6] +  display[7][6] + display[8][6];
	 line4 = display[0][5] +  display[1][5] +  display[2][5] +  display[3][5] +  display[4][5] +  display[5][5] +  display[6][5] +  display[7][5] + display[8][5];
	 line5 = display[0][4] +  display[1][4] +  display[2][4] +  display[3][4] +  display[4][4] +  display[5][4] +  display[6][4] +  display[7][4] + display[8][4];
	 line6 = display[0][3] +  display[1][3] +  display[2][3] +  display[3][3] +  display[4][3] +  display[5][3] +  display[6][3] +  display[7][3] + display[8][3];
	 line7 = display[0][2] +  display[1][2] +  display[2][2] +  display[3][2] +  display[4][2] +  display[5][2] +  display[6][2] +  display[7][2] + display[8][2];
	 line8 = display[0][1] +  display[1][1] +  display[2][1] +  display[3][1] +  display[4][1] +  display[5][1] +  display[6][1] +  display[7][1] + display[8][1];
	 line9 = display[0][0] +  display[1][0] +  display[2][0] +  display[3][0] +  display[4][0] +  display[5][0] +  display[6][0] +  display[7][0] + display[8][0];
			
	System.out.println(line1);
	System.out.println(line2);
	System.out.println(line3);
	System.out.println(line4);
	System.out.println(line5);
	System.out.println(line6);
	System.out.println(line7);
	System.out.println(line8);
	System.out.println(line9);
	System.out.println("");
	System.out.println("Enter command");
	input = reader.nextLine();
	
	}
	
	System.out.println("You fail");
	System.exit(1);
}
}

}
