package Classes;

import java.util.ArrayList;

public class FahrzeugDataController 
{
	static ArrayList<Fahrzeug> listFahrzeug = new ArrayList<Fahrzeug>();
	
	public static void ShowAllFahrzeuge()
	{
		for(Fahrzeug x : listFahrzeug)
		{
			if(x instanceof Transportfahrzeug)
			{
				Main.Printer( ((Transportfahrzeug)x).getMarke()+ " "+((Transportfahrzeug)x).getAbschreibungsdauer()+" "+((Transportfahrzeug)x).getKaufdatum()+" "+((Transportfahrzeug)x).getMonatlicheKosten()+" "+((Transportfahrzeug)x).getTyp() + " " + ((Transportfahrzeug)x).getGewicht());
			}
			if(x instanceof Flurfoerderzeug)
			{
				Main.Printer( ((Flurfoerderzeug)x).getMarke()+ " "+((Flurfoerderzeug)x).getAbschreibungsdauer()+" "+((Flurfoerderzeug)x).getKaufdatum()+" "+((Flurfoerderzeug)x).getMonatlicheKosten()+" "+((Flurfoerderzeug)x).getWagenKategorie() + " " + ((Flurfoerderzeug)x).getPm().getName());
			}
			if(x instanceof Elektromotor)
			{
				Main.Printer( ((Elektromotor)x).getMarke()+ " "+((Elektromotor)x).getAbschreibungsdauer()+" "+((Elektromotor)x).getKaufdatum()+" "+((Elektromotor)x).getMonatlicheKosten()+" "+((Elektromotor)x).getWagenKategorie()+" "+((Elektromotor)x).getMitarbeiter().getName()+" "+ ((Elektromotor) x).getAkkuKapazitaet() + " " +((Elektromotor) x).getAkkuLader() + " ");
			}
			if(x instanceof Kraftmotor)
			{
				Main.Printer( ((Kraftmotor)x).getMarke()+ " "+((Kraftmotor)x).getAbschreibungsdauer()+" "+((Kraftmotor)x).getKaufdatum()+" "+((Kraftmotor)x).getMonatlicheKosten()+" "+((Kraftmotor)x).getWagenKategorie()+" "+((Kraftmotor)x).getMitarbeiter().getName()+" "+((Kraftmotor) x).getTreibstoff());
			}
			if(x instanceof Hybrid)
			{
				Main.Printer( ((Hybrid)x).getMarke()+ " "+((Hybrid)x).getAbschreibungsdauer()+" "+((Hybrid)x).getKaufdatum()+" "+((Hybrid)x).getMonatlicheKosten()+" "+((Hybrid)x).getWagenKategorie()+" "+((Hybrid)x).getMitarbeiter().getName()+" "+((Hybrid) x).getAkkuKapazitaet() + " " + ((Hybrid) x).getAkkuLader() + " ");
			}
				
		}
	}
	
	public static void ShowElektromotorsFahrzeug()
	{
		for(Fahrzeug e : listFahrzeug)
		{
			if(e instanceof Elektromotor)
			{
				Main.Printer( ((Elektromotor)e).getMarke()+ " "+((Elektromotor)e).getAbschreibungsdauer()+" "+((Elektromotor)e).getKaufdatum()+" "+((Elektromotor)e).getMonatlicheKosten()+" "+((Elektromotor)e).getWagenKategorie()+" "+((Elektromotor)e).getMitarbeiter().getName()+" "+ ((Elektromotor)e).getAkkuKapazitaet() + " " +((Elektromotor)e).getAkkuLader() + " ");
			}
		}
	}
	
	public static void ShowKraftmotorsFahrzeug()
	{
		for(Fahrzeug k : listFahrzeug)
		{
			if(k instanceof Elektromotor)
			{
				Main.Printer( ((Kraftmotor)k).getMarke()+ " "+((Kraftmotor)k).getAbschreibungsdauer()+" "+((Kraftmotor)k).getKaufdatum()+" "+((Kraftmotor)k).getMonatlicheKosten()+" "+((Kraftmotor)k).getWagenKategorie()+" "+((Kraftmotor)k).getMitarbeiter().getName()+" "+((Kraftmotor)k).getTreibstoff());
			}
		}
	}
	
	public static void ShowHybridFahrzeug()
	{
		for(Fahrzeug h : listFahrzeug)
		{
			if(h instanceof Elektromotor)
			{
				Main.Printer( ((Hybrid)h).getMarke()+ " "+((Hybrid)h).getAbschreibungsdauer()+" "+((Hybrid)h).getKaufdatum()+" "+((Hybrid)h).getMonatlicheKosten()+" "+((Hybrid)h).getWagenKategorie()+" "+((Hybrid)h).getMitarbeiter().getName()+" "+((Hybrid)h).getAkkuKapazitaet() + " " + ((Hybrid)h).getAkkuLader());
			}
		}
	}
	
	public static void ShowTransportFahrzeug()
	{
		for(Fahrzeug t : listFahrzeug)
		{
			if(t instanceof Transportfahrzeug)
			{
				Main.Printer( ((Transportfahrzeug)t).getMarke()+ " "+((Transportfahrzeug)t).getAbschreibungsdauer()+" "+((Transportfahrzeug)t).getKaufdatum()+" "+((Transportfahrzeug)t).getMonatlicheKosten()+" "+((Transportfahrzeug)t).getTyp() + " " + ((Transportfahrzeug)t).getGewicht());
			}
		}
	}
	
	public static void ShowFlurfoerderFahrzeug()
	{
		for(Fahrzeug f : listFahrzeug)
		{
			if(f instanceof Flurfoerderzeug)
			{
				Main.Printer( ((Flurfoerderzeug)f).getMarke()+ " "+((Flurfoerderzeug)f).getAbschreibungsdauer()+" "+((Flurfoerderzeug)f).getKaufdatum()+" "+((Flurfoerderzeug)f).getMonatlicheKosten()+" "+((Flurfoerderzeug)f).getWagenKategorie() + " " + ((Flurfoerderzeug)f).getPm().getName());
			}
		}
	}
	
	public static void AddFahrzeug(Fahrzeug objekt)
	{
		listFahrzeug.add(objekt);
	}
	

}
