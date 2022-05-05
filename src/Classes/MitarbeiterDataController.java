package Classes;

import java.util.ArrayList;

import Classes.ENUMS.HasSchein;

public class MitarbeiterDataController 
{
	private static ArrayList<Mitarbeiter> listMitarbeiter = new ArrayList<Mitarbeiter>();
	
	public static ArrayList<Mitarbeiter> getListMitarbeiter() 
	{
		return listMitarbeiter;
	}
	
	public static ArrayList<ProduktionMitarbeiter> getListProduktionMitarbeiter() 
	{
		ArrayList<ProduktionMitarbeiter> temp = new ArrayList<ProduktionMitarbeiter>();
		for(Mitarbeiter obj : listMitarbeiter)
		{
			if(obj instanceof ProduktionMitarbeiter)
			{
				temp.add((ProduktionMitarbeiter) obj);
			}
		}
		return temp;
	}
	public static Mitarbeiter GetOnID(int id)
	{
		return listMitarbeiter.get(id-1);
		
	}
	public static void ShowAllMitarbeiter()
	{
		for(Mitarbeiter m : listMitarbeiter)
		{
			if(m instanceof ProduktionMitarbeiter)
			{
				Main.Printer("ID: "+((ProduktionMitarbeiter)m).getId() + " | " + "Name: "+((ProduktionMitarbeiter)m).getName()+ " | "+ (((ProduktionMitarbeiter)m).isStaplerschein() ? HasSchein.JA : HasSchein.NEIN) );
				continue;
			}
			if(m instanceof Mitarbeiter)
			{
				Main.Printer("ID: "+((Mitarbeiter)m).getId() + " | " + "Name: "+((Mitarbeiter)m).getName());
			}
			
		}
		Main.Printer("");
	}
	
	public static void ShowProduktionMitarbeiter()
	{
		for(Mitarbeiter pm : listMitarbeiter)
		{
			if(pm instanceof ProduktionMitarbeiter)
			{
				Main.Printer("ID: "+((ProduktionMitarbeiter)pm).getId() + " | " +"Name: "+((ProduktionMitarbeiter)pm).getName()+ " | "+ ( ((ProduktionMitarbeiter)pm).isStaplerschein() ? HasSchein.JA : HasSchein.NEIN ) );
			}
		}
	}
		
		public static void ShowMitarbeiter()
		{
			for(Mitarbeiter M : listMitarbeiter)
			{
				if(M instanceof Mitarbeiter && !(M instanceof ProduktionMitarbeiter) )
				{
					Main.Printer("ID: "+((Mitarbeiter)M).getId() + " | " + "Name: "+((Mitarbeiter)M).getName() );
				}
			}
	}
	
	public static void AddMitarbeiter(Mitarbeiter objekt)
	{
		listMitarbeiter.add(objekt);
	}
	
}
