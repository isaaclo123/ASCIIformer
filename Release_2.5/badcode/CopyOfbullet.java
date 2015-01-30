
public class CopyOfbulletasdfasd {
	
	//private static Boolean run = false;
	
	
	public static controls shoot = new controls();
	
	

		
	@SuppressWarnings("static-access")
	public static void bot(Boolean run, int a, int b) {
		
	
		
	//shoot.a = 14;
	//shoot.b = 5;
		shoot.a = a;
		shoot.b = b;
		
	
		
	while (run == true){
		
	if (variables.input.equals("s"))
	{
		if (shoot.a == 1){
			variables.level[variables.levelnum][shoot.a][shoot.b] = " ";
			run = false;
		}
		else {
			shoot.movement("left", "▒", false);
		}
	
	}
	else if (variables.input.equals("w"))
	{
		if (shoot.a == 1){
			variables.level[variables.levelnum][shoot.a][shoot.b] = " ";
			run = false;
		}
		else {
			shoot.movement("left", "▒", false);
		}
	
	}
else if (variables.input.equals("a"))
	{
	if (shoot.a == 1){
		variables.level[variables.levelnum][shoot.a][shoot.b] = " ";
		run = false;
	}
	else {
		shoot.movement("left", "▒", false);
	}
	}
	else if (variables.input.equals("d"))
	{
		if (shoot.a == 1){
			variables.level[variables.levelnum][shoot.a][shoot.b] = " ";
			run = false;
		}
		else {
			shoot.movement("left", "▒", false);
		}
	}

	}
}
}