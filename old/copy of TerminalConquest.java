import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
 


public class TerminalConquest {
	
	private static Scanner reader;
	
public static void main(String[] args) {
	int a = 0;
	String stringa;
	int b = 0;
	String stringb;
	String player = "x0y0";
	Boolean run = true;

	reader = new Scanner(System.in);

	String x0y8 = "#"; String x1y8 = "#"; String x2y8 = "#"; String x3y8 = "#"; String x4y8 = "#"; String x5y8 = "#"; String x6y8 = "#"; String x7y8 = "#"; String x8y8 = "#";
	String x0y7 = "#"; String x1y7 = "#"; String x2y7 = "#"; String x3y7 = "#"; String x4y7 = "#"; String x5y7 = "#"; String x6y7 = "#"; String x7y7 = "#"; String x8y7 = "#";
	String x0y6 = "#"; String x1y6 = "#"; String x2y6 = "#"; String x3y6 = "#"; String x4y6 = "#"; String x5y6 = "#"; String x6y6 = "#"; String x7y6 = "#"; String x8y6 = "#";
	String x0y5 = "#"; String x1y5 = "#"; String x2y5 = "#"; String x3y5 = "#"; String x4y5 = "#"; String x5y5 = "#"; String x6y5 = "#"; String x7y5 = "#"; String x8y5 = "#";
	String x0y4 = "#"; String x1y4 = "#"; String x2y4 = "#"; String x3y4 = "#"; String x4y4 = "#"; String x5y4 = "#"; String x6y4 = "#"; String x7y4 = "#"; String x8y4 = "#";
	String x0y3 = "#"; String x1y3 = "#"; String x2y3 = "#"; String x3y3 = "#"; String x4y3 = "#"; String x5y3 = "#"; String x6y3 = "#"; String x7y3 = "#"; String x8y3 = "#";
	String x0y2 = "#"; String x1y2 = "#"; String x2y2 = "#"; String x3y2 = "#"; String x4y2 = "#"; String x5y2 = "#"; String x6y2 = "#"; String x7y2 = "#"; String x8y2 = "#";
	String x0y1 = "#"; String x1y1 = "#"; String x2y1 = "#"; String x3y1 = "#"; String x4y1 = "#"; String x5y1 = "#"; String x6y1 = "#"; String x7y1 = "#"; String x8y1 = "#";
	String x0y0 = "#"; String x1y0 = "#"; String x2y0 = "#"; String x3y0 = "#"; String x4y0 = "#"; String x5y0 = "#"; String x6y0 = "#"; String x7y0 = "#"; String x8y0 = "#";
	
	String backup = "x0y0";
	Map variables = new HashMap<String,String>();
	
	String line1 = x0y8 +  x1y8 +  x2y8 +  x3y8 +  x4y8 +  x5y8 +  x6y8 +  x7y8 + x8y8;
	String line2 = x0y7 +  x1y7 +  x2y7 +  x3y7 +  x4y7 +  x5y7 +  x6y7 +  x7y7 + x8y7;
	String line3 = x0y6 +  x1y6 +  x2y6 +  x3y6 +  x4y6 +  x5y6 +  x6y6 +  x7y6 + x8y6;
	String line4 = x0y5 +  x1y5 +  x2y5 +  x3y5 +  x4y5 +  x5y5 +  x6y5 +  x7y5 + x8y5;
	String line5 = x0y4 +  x1y4 +  x2y4 +  x3y4 +  x4y4 +  x5y4 +  x6y4 +  x7y4 + x8y4;
	String line6 = x0y3 +  x1y3 +  x2y3 +  x3y3 +  x4y3 +  x5y3 +  x6y3 +  x7y3 + x8y3;
	String line7 = x0y2 +  x1y2 +  x2y2 +  x3y2 +  x4y2 +  x5y2 +  x6y2 +  x7y2 + x8y2;
	String line8 = x0y1 +  x1y1 +  x2y1 +  x3y1 +  x4y1 +  x5y1 +  x6y1 +  x7y1 + x8y1;
	String line9 = x0y0 +  x1y0 +  x2y0 +  x3y0 +  x4y0 +  x5y0 +  x6y0 +  x7y0 + x8y0;
	
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
	
		if (input.equals("right"))
		{
			backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			a = a + 1;
			stringa = "" + a;
			stringb = "" + b;
			player = "x + a + x + b";
			variables.put("player", "x + a + x + b"); 
			variables.get("player") = "@"; 
			
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
		if (input.equals("left"))
		{
			backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			a = a - 1;
			stringa = "" + a;
			stringb = "" + b;
			player = "x + a + x + b";
			
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
			backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			a = a + 1;
			b = b + 1;
			stringa = "" + a;
			stringb = "" + b;
			player = "x + a + x + b";
			
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
			backup = player;
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			a = a - 1;
			b = b + 1;
			stringa = "" + a;
			stringb = "" + b;
			player = "x + a + x + b";
			
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
