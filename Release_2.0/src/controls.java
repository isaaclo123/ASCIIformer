
public class controls {
	public static void up() {
		variables.olda = variables.a;
		variables.oldb = variables.b;
		
		variables.a = variables.a - 1;
		
		if (variables.level[variables.levelnum][variables.a][variables.b].equals("█"))
		{
			variables.a = variables.a + 1;
			variables.olda = variables.a + 1;
			
		}
		
	functions.checkscore();
	functions.checklife();
		
		variables.level[variables.levelnum][variables.a][variables.b] = "☻";
		variables.level[variables.levelnum][variables.olda][variables.oldb] = variables.level[variables.backuplevelnum][variables.olda][variables.oldb];
		variables.backuplevelnum = variables.levelnum + 1;
	}
	public static void down() {
		variables.olda = variables.a;
		variables.oldb = variables.b;
		
		variables.a = variables.a + 1;
		
		if (variables.level[variables.levelnum][variables.a][variables.b].equals("█"))
		{
			variables.a = variables.a - 1;
			variables.olda = variables.a - 1;
			
		}
		functions.checkscore();
		functions.checklife();
		
		variables.level[variables.levelnum][variables.a][variables.b] = "☻";
		variables.level[variables.levelnum][variables.olda][variables.oldb] = variables.level[variables.backuplevelnum][variables.olda][variables.oldb];
		variables.backuplevelnum = variables.levelnum + 1;
	}
	public static void left() {
		variables.olda = variables.a;
		variables.oldb = variables.b;
		
		variables.b = variables.b - 1;
		
		if (variables.level[variables.levelnum][variables.a][variables.b].equals("█"))
		{
			variables.b = variables.b + 1;
			variables.oldb = variables.b + 1;
			
		}
		if (variables.b == 0)
		{
			variables.b = variables.b + 1;
			variables.oldb = variables.oldb + 1;
			
		}
		functions.checkscore();
		functions.checklife();
		
		variables.level[variables.levelnum][variables.a][variables.b] = "☻";
		variables.level[variables.levelnum][variables.olda][variables.oldb] = variables.level[variables.backuplevelnum][variables.olda][variables.oldb];
		variables.backuplevelnum = variables.levelnum + 1;
	}
	public static void right (){
		variables.olda = variables.a;
		variables.oldb = variables.b;
		
		variables.b = variables.b + 1;
		
		if (variables.level[variables.levelnum][variables.a][variables.b].equals("█"))
		{
			variables.b = variables.b - 1;
			variables.oldb = variables.b - 1;
			
		}
		
		if (variables.b == (variables.level[variables.levelnum][variables.a].length - 1)){
			variables.b = 1;
			variables.levelnum = variables.levelnum + 2;
		}
		functions.checkscore();
		functions.checklife();
		
		variables.level[variables.levelnum][variables.a][variables.b] = "☻";
		variables.level[variables.levelnum][variables.olda][variables.oldb] = variables.level[variables.backuplevelnum][variables.olda][variables.oldb];
		variables.backuplevelnum = variables.levelnum + 1;
		
	}
}
