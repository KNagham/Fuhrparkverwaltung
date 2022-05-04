package Classes;

public class MenuSystem {
	
	public static void ProgramLoop()
	{
		
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Read Data","Create Data");
			choice  = Main.GetIntInput(2);
			
			if(choice == 1)
			{
				ReadData();
			}
			else if(choice == 2)
			{
				//TODO
				CreateData();
			}
		}
		Main.Printer("Auf wiedersehen");
	}
	
	private static void ReadData()
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Mitarbeiter","Fahrzeug");
			choice  = Main.GetIntInput(2);
			
			if(choice == 1)
			{
				MitarbeiterDataController.ShowAllMitarbeiter();
			}
			else if(choice == 2)
			{
				FahrzeugDataController.ShowAllFahrzeuge();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	private static void CreateData()
	{
		//TODO
	}
	
}
