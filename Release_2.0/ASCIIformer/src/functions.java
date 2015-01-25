import java.util.Scanner;


public class functions {	
	
	
	public static void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void titleprint(){
		String[][] title = new String[][]
				
				{
					{" ","█","█","█","█","█","╗"," ","█","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗","█","█","╗","█","█","╗","█","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗"," ","█","█","█","█","█","█","╗"," ","█","█","█","╗"," "," "," ","█","█","█","╗","█","█","█","█","█","█","█","╗","█","█","█","█","█","█","╗"},
					{"█","█","╔","═","═","█","█","╗","█","█","╔","═","═","═","═","╝","█","█","╔","═","═","═","═","╝","█","█","║","█","█","║","█","█","╔","═","═","═","═","╝","█","█╔","═","═","═","█","█","╗","█","█","╔","═","═","█","█","╗","█","█","█","█","╗"," ","█","█","█","█","║","█","█","╔","═","═","═","═","╝","█","█","╔","═","═","█","█","╗"},
					{"█","█","█","█","█","█","█","║","█","█","█","█","█","█","█","╗","█","█","║"," "," "," "," "," ","█","█","║","█","█","║","█","█","█","█","█","╗"," "," ","█","█","║"," "," "," ","█","█","║","█","█","█","█","█","█","╔","╝","█","█","╔","█","█","█","█","╔","█","█","║","█","█","█","█","█","╗"," "," ","█","█","█","█","█","█","╔","╝"},
					{"█","█","╔","═","═","█","█","║","╚","═","═","═","═","█","█","║","█","█","║"," "," "," "," "," ","█","█","║","█","█","║","█","█","╔","═","═","╝"," "," ","█","█","║"," "," "," ","█","█","║","█","█","╔","═","═","█","█","╗","█","█","║","╚","█","█","╔","╝","█","█","║","█","█","╔","═","═","╝"," "," ","█","█","╔","═","═","█","█","╗"},
					{"█","█","║"," "," ","█","█","║","█","█","█","█","█","█","█","║","╚","█","█","█","█","█","█","╗","█","█","║","█","█","║","█","█","║"," "," "," "," "," ","╚","█","█","█","█","█","█","╔","╝","█","█","║"," "," ","█","█","║","█","█","║"," ","╚","═","╝"," ","█","█","║","█","█","█","█","█","█","█","╗","█","█","║"," "," ","█","█","║"},
					{"╚","═","╝"," "," ","╚","═","╝","╚","═","═","═","═","═","═","╝"," ","╚","═","═","═","═","═","╝","╚","═","╝","╚","═","╝","╚","═","╝"," "," "," "," "," "," ","╚","═","═","═","═","═","╝"," ","╚","═","╝"," "," ","╚","═","╝","╚","═","╝"," "," "," "," "," ","╚","═","╝","╚","═","═","═","═","═","═","╝","╚","═","╝"," "," ","╚","═","╝"},
				};
		int x = 0;
		int y = 0;
		functions.clear();
		for (x = 0; x < title.length; x++) 
	    {
			try {
				Thread.sleep(3);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        for (y = 0; y < title[x].length ; y++) 
	        {
	        	try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		
		functions.clear();
	}
	public static void print() {
		System.out.print("HP:");
		System.out.print(variables.hp);
		System.out.print(" LIVES:");
		System.out.println(variables.life);
		System.out.print("SCORE:");
		System.out.println(variables.score);
		System.out.println("");
		int x = 0;
		int y = 0;
		for (x = 0; x < variables.level[variables.levelnum].length; x++) 
	    {
			//Thread.sleep(5);
	        for (y = 0; y < variables.level[variables.levelnum][x].length ; y++) 
	        {
	        	//Thread.sleep(5);
	            System.out.print(variables.level[variables.levelnum][x][y]);
	        }
	        System.out.println();
	    }
		x = 0;
		y = 0;
		
		System.out.println("");
		
		System.out.println("ENTER COMMAND:");
	}
	public static void gravity() {
		int i = 0;
		while (i < (variables.level[variables.levelnum][variables.a].length - 1)){
			controls.down();
			
		i = i + 1;
		}
		variables.jump = 0;
		i = 0;
	}

	public static void checkscore(){
		if (variables.level[variables.levelnum][variables.a][variables.b].equals("*"))
		{
			variables.score = variables.score + 100;
		}
		else if (variables.level[variables.levelnum][variables.a][variables.b].equals("ʌ"))
		{
			variables.score = variables.score - 100;
			variables.hp = variables.hp - 100;
		}
		
		
	}
public static void checklife(){
	if (variables.hp == 0){
		variables.life = variables.life - 1;
		variables.hp = 500;
		
		variables.level[variables.levelnum][variables.olda][variables.oldb] = variables.level[variables.backuplevelnum][variables.olda][variables.oldb];
		variables.a = 9;
		variables.olda = 9;
		variables.b = 1;
		variables.oldb = 1;
		
	}
	if (variables.life == 0)
	{
		functions.clear();
		System.out.println("GAME OVER");
		System.out.print("SCORE:");
		System.out.println(variables.score);
		System.exit(1);
	}
}

}
