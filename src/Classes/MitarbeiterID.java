package Classes;

public class MitarbeiterID {
	private static int id = 0;
	
	public static int getId()
	{
		return id;
	}
	
	public static void incrementId()
	{
		id++;
	}
}
