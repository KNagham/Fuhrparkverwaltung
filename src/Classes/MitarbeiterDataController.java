package Classes;

import java.util.ArrayList;

public class MitarbeiterDataController 
{
	private static ArrayList<Mitarbeiter> listMitarbeiter = new ArrayList<Mitarbeiter>();
	
	
	public static void ShowAllMitarbeiter()
	{
		for(Mitarbeiter m : listMitarbeiter)
		{
			if(m instanceof Mitarbeiter)
			{
				Main.Printer(((Mitarbeiter)m).getId() + " " + ((Mitarbeiter)m).getName());
			}
			if(m instanceof ProduktionMitarbeiter)
			{
				Main.Printer(((ProduktionMitarbeiter)m).getId() + " " + ((ProduktionMitarbeiter)m).getName()+ " "+ ((ProduktionMitarbeiter)m).isStaplerschein() );
			}
			
		}
	}
	
	public static void ShowProduktionMitarbeiter()
	{
		for(Mitarbeiter pm : listMitarbeiter)
		{
			if(pm instanceof ProduktionMitarbeiter)
			{
				Main.Printer(((ProduktionMitarbeiter)pm).getId() + " " + ((ProduktionMitarbeiter)pm).getName()+ " "+ ((ProduktionMitarbeiter)pm).isStaplerschein() );
			}
		}
	}
		
		public static void ShowMitarbeiter()
		{
			for(Mitarbeiter M : listMitarbeiter)
			{
				if(M instanceof Mitarbeiter)
				{
					Main.Printer(((Mitarbeiter)M).getId() + " " + ((Mitarbeiter)M).getName() );
				}
			}
	}
	
	public static void AddMitarbeiter(Mitarbeiter objekt)
	{
		listMitarbeiter.add(objekt);
	}
	
}