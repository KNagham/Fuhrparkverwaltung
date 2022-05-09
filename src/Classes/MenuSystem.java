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
				MitarbeiterOptions();
			}
			else if(choice == 2)
			{
				FahrzeugeOptions();
			}
			
		}
	}
	
	private static void MitarbeiterOptions()
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Mitarbeiter","Produktion Mitarbeiter", "All Mitarbeiter");
			
			choice = Main.GetIntInput(3);
			if(choice == 1)
			{
				MitarbeiterDataController.ShowMitarbeiter();
			}
			else if(choice == 2)
			{
				MitarbeiterDataController.ShowProduktionMitarbeiter();
			}
			else if(choice == 3)
			{
				MitarbeiterDataController.ShowAllMitarbeiter();
			}
		}
		
	}
	private static void FahrzeugeOptions()
	{
		System.out.println();
			
			
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("TransportFahrzeug", "FlurförderZeug", "Firmenwagen", "AllFahrzeuge");
			choice = Main.GetIntInput(4);
			if(choice == 1)
			{
				FahrzeugDataController.ShowTransportFahrzeug();
			}
			else if(choice == 2)
			{
		    	FahrzeugDataController.ShowFlurfoerderFahrzeug();
			}
			else if(choice == 3)
			{
				FirmenWagen();
			}	
			else if(choice == 4)
			{
				FahrzeugDataController.ShowAllFahrzeuge();
			}
		}
	}
	private static void FirmenWagen() 
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Elektromotor Fahrzeug", "Kraftmotor Fahrzeug", "Hybrid Fahrzeug");
			choice = Main.GetIntInput(3);
			if(choice == 1)
			{
				FahrzeugDataController.ShowElektromotorsFahrzeug();
			}
			else if(choice == 2)
			{
				FahrzeugDataController.ShowKraftmotorsFahrzeug();
			}
			else if(choice == 3)
			{
				FahrzeugDataController.ShowHybridFahrzeug();
			}
		}
			
			
	}

	private static void CreateData()
	{
		System.out.println();
				
				
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Mitarbeiter","Fahrzeug");
			choice  = Main.GetIntInput(2);
					
			if(choice == 1)
			{
				CreateMitarbeiterMenu();
			}
			else if(choice == 2)
			{
				CreateFahrzeugMenu();
			}
		}
	}
	private static void CreateMitarbeiterMenu() 
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Mitarbeiter", "Produktion Mitarbeiter");
			choice = Main.GetIntInput(2);
			if(choice == 1)
			{
				Main.CreateMitarbeiter();
			}
			else if(choice == 2)
			{
				Main.CreateProduktionMitarbeiter();
			}
		}
	}
	private static void CreateFahrzeugMenu() 
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("TransportFahrzeug", "FlurförderZeug", "Firmenwagen");
			choice = Main.GetIntInput(3);
			if(choice == 1)
			{
				Main.CreateTransport();
			}
			else if(choice == 2)
			{
		    	Main.CreateFlurfoerderzeug();
			}
			else if(choice == 3)
			{
				CreateFirmenWagen();
			}	
			
		}
	}

	private static void CreateFirmenWagen() 
	{
		System.out.println();
		
		
		int choice = -1;
		while(choice != 0)
		{
			Main.ShowOptions("Elektromotor Fahrzeug", "Kraftmotor Fahrzeug", "Hybrid Fahrzeug");
			choice = Main.GetIntInput(3);
			if(choice == 1)
			{
				Main.CreateElektromotor();
			}
			else if(choice == 2)
			{
				Main.CreateKraftmotor();
			}
			else if(choice == 3)
			{
				Main.CreateHybrid();
			}
		}
	}

	
}
