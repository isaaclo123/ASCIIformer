
public class controls {
	
	public static int a;
	public static int b;

	public static void movement(String control, String character, Boolean score) {
	
	int olda = a;
	int oldb = b;
	
	if(control.equals("up")) {
		olda = a;
		oldb = b;
		
		a = a - 1;
		
		if (variables.level[variables.levelnum][a][b].equals("█"))
		{
			a = a + 1;
			olda = a + 1;
			
		}
	if (score = true){
	functions.checkscore();
	functions.checklife();
	}
		
	variables.level[variables.levelnum][a][b] = character;
	variables.level[variables.levelnum][olda][oldb] = variables.level[variables.backuplevelnum][olda][oldb];
	variables.backuplevelnum = variables.levelnum + 1;
	}
	if(control.equals("down")) {
		olda = a;
		oldb = b;
		
		a = a + 1;
		
		if (variables.level[variables.levelnum][a][b].equals("█"))
		{
			a = a - 1;
			olda = a - 1;
			
		}
		if (score = true){
			functions.checkscore();
			functions.checklife();
			}
		
		variables.level[variables.levelnum][a][b] = character;
		variables.level[variables.levelnum][olda][oldb] = variables.level[variables.backuplevelnum][olda][oldb];
		variables.backuplevelnum = variables.levelnum + 1;
	}
	if(control.equals("left")) {
		olda = a;
		oldb = b;
		
		b = b - 1;
		
		if (variables.level[variables.levelnum][a][b].equals("█"))
		{
			b = b + 1;
			oldb = b + 1;
			
		}
		if (b == 0)
		{
			b = b + 1;
			oldb = oldb + 1;
			
		}
		if (score = true){
			functions.checkscore();
			functions.checklife();
			}
		
		variables.level[variables.levelnum][a][b] = character;
		variables.level[variables.levelnum][olda][oldb] = variables.level[variables.backuplevelnum][olda][oldb];
		variables.backuplevelnum = variables.levelnum + 1;
	}
	if(control.equals("right")){
		olda = a;
		oldb = b;
		
		b = b + 1;
		
		if (variables.level[variables.levelnum][a][b].equals("█"))
		{
			b = b - 1;
			oldb = b - 1;
			
		}
		
		if (b == (variables.level[variables.levelnum][a].length - 1)){
			b = 1;
			variables.levelnum = variables.levelnum + 2;
		}
		if (score = true){
			functions.checkscore();
			functions.checklife();
			}
		
		variables.level[variables.levelnum][a][b] = character;
		variables.level[variables.levelnum][olda][oldb] = variables.level[variables.backuplevelnum][olda][oldb];
		variables.backuplevelnum = variables.levelnum + 1;
		
	}
}


}
