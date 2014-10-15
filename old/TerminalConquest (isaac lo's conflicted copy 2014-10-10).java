import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
import java.io.*;

 


public class TerminalConquest {
	
	private static Scanner reader;
	
public static void main(String[] args) {
	int a = 0;
	int b = 0;
	Boolean run = true;

	reader = new Scanner(System.in);

	String[][] display = new String[9][9];
	display[0][8] =  "#"; display[1][8] =  "#"; display[2][8] =  "#"; display[3][8] =  "#"; display[4][8] =  "#"; display[5][8] =  "#"; display[6][8] =  "#"; display[7][8] =  "#"; display[8][8] =  "#";
	display[0][7] =  "#"; display[1][7] =  "#"; display[2][7] =  "#"; display[3][7] =  "#"; display[4][7] =  "#"; display[5][7] =  "#"; display[6][7] =  "#"; display[7][7] =  "#"; display[8][7] =  "#";
	display[0][6] =  "#"; display[1][6] =  "#"; display[2][6] =  "#"; display[3][6] =  "#"; display[4][6] =  "#"; display[5][6] =  "#"; display[6][6] =  "#"; display[7][6] =  "#"; display[8][6] =  "#";
	display[0][5] =  "#"; display[1][5] =  "#"; display[2][5] =  "#"; display[3][5] =  "#"; display[4][5] =  "#"; display[5][5] =  "#"; display[6][5] =  "#"; display[7][5] =  "#"; display[8][5] =  "#";
	display[0][4] =  "#"; display[1][4] =  "#"; display[2][4] =  "#"; display[3][4] =  "#"; display[4][4] =  "#"; display[5][4] =  "#"; display[6][4] =  "#"; display[7][4] =  "#"; display[8][4] =  "#";
	display[0][3] =  "#"; display[1][3] =  "#"; display[2][3] =  "#"; display[3][3] =  "#"; display[4][3] =  "#"; display[5][3] =  "#"; display[6][3] =  "#"; display[7][3] =  "#"; display[8][3] =  "#";
	display[0][2] =  "#"; display[1][2] =  "#"; display[2][2] =  "#"; display[3][2] =  "#"; display[4][2] =  "#"; display[5][2] =  "#"; display[6][2] =  "#"; display[7][2] =  "#"; display[8][2] =  "#";
	display[0][1] =  "#"; display[1][1] =  "#"; display[2][1] =  "#"; display[3][1] =  "#"; display[4][1] =  "#"; display[5][1] =  "#"; display[6][1] =  "#"; display[7][1] =  "#"; display[8][1] =  "#";
	display[0][0] =  "#"; display[1][0] =  "#"; display[2][0] =  "#"; display[3][0] =  "#"; display[4][0] =  "#"; display[5][0] =  "#"; display[6][0] =  "#"; display[7][0] =  "#"; display[8][0] =  "#";
	
	
	String backup = display[a][b];
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

	while (run == true){
	
		
		if (input.equals("left"))
		{
			//backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			display[a][b] = backup;
			backup = display[a][b];
			a = a - 1;
			backup = display[a][b];
			display[a][b] = "@";
			
					
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
		else if (input.equals("right"))
		{
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			display[a][b] = backup;
			a = a + 1;
			backup = display[a][b];
			display[a][b] = "@";
			//display[a - 1][b] = backup;
			
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
		else if (input.equals("upright"))
		{
			//backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			display[a][b] = backup;
			a = a + 1;
			b = b + 1;
			backup = display[a][b];
			display[a][b] = "@";
					
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
		else if (input.equals("upleft"))
		{
			//backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			display[a][b] = backup;
			a = a - 1;
			b = b + 1;
			backup = display[a][b];
			display[a][b] = "@";
			
					
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
		else if (input.equals("quit"))
		{
			run = false;
			System.exit(1);
		}
		else
		{
			System.out.println("");
			System.out.println("Not a valid command.");
			System.out.println("Enter a valid command");
			input = reader.nextLine();	
			
		}
	}
}
}
