
public class asdfasdbullet {
	
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
		
			shoot.movement("left", "▒", false);
		
	
	}
	else if (variables.input.equals("w"))
	{
		shoot.movement("left", "▒", false);
	
	}
else if (variables.input.equals("a"))
	{
	shoot.movement("left", "▒", false);
	}
	else if (variables.input.equals("d"))
	{
		shoot.movement("left", "▒", false);
	}

	}
}
}