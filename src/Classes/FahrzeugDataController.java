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
				Main.Printer("Marke: " +((Transportfahrzeug)x).getMarke()+ " | "+"Abschreibungsdauer: "+((Transportfahrzeug)x).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Transportfahrzeug)x).getKaufdatum()+" | "+"Monatliche Kosten: "+((Transportfahrzeug)x).getMonatlicheKosten()+" | "+"Fahrzeug Typ & Gewicht: "+((Transportfahrzeug)x).getTyp());
			}
			if(x instanceof Flurfoerderzeug)
			{
				Main.Printer("Marke: "+((Flurfoerderzeug)x).getMarke()+ " | "+"Abschreibungsdauer: "+((Flurfoerderzeug)x).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Flurfoerderzeug)x).getKaufdatum()+" | "+"Monatliche Kosten: "+((Flurfoerderzeug)x).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Flurfoerderzeug)x).getWagenKategorie() + " | " +"Produktion Mitarbeiter Name: "+((Flurfoerderzeug)x).getProduktionMitarbeiter().getName());
			}
			if(x instanceof Elektromotor)
			{
				Main.Printer("Marke: "+((Elektromotor)x).getMarke()+ " "+"Abschreibungsdauer: "+((Elektromotor)x).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Elektromotor)x).getKaufdatum()+" | "+"Monatliche Kosten: "+((Elektromotor)x).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Elektromotor)x).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Elektromotor)x).getMitarbeiter().getName()+" | "+"Akku Kapazität: "+((Elektromotor) x).getAkkuKapazitaet() + " | " +"Akku Lader: "+((Elektromotor) x).getAkkuLader());
			}
			if(x instanceof Kraftmotor)
			{
				Main.Printer("Marke: "+((Kraftmotor)x).getMarke()+ " | "+"Abschreibungsdauer: "+((Kraftmotor)x).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Kraftmotor)x).getKaufdatum()+" | "+"Monatliche Kosten: "+((Kraftmotor)x).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Kraftmotor)x).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Kraftmotor)x).getMitarbeiter().getName()+" | "+"Treibstoff: "+((Kraftmotor) x).getTreibstoff());
			}
			if(x instanceof Hybrid)
			{
				Main.Printer("Marke: "+((Hybrid)x).getMarke()+ " | "+"Abschreibungsdauer: "+((Hybrid)x).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Hybrid)x).getKaufdatum()+" | "+"Monatliche Kosten: "+((Hybrid)x).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Hybrid)x).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Hybrid)x).getMitarbeiter().getName()+" | "+"Akku Kapazität: "+((Hybrid) x).getAkkuKapazitaet() + " | " +"Akku Lader: "+((Hybrid) x).getAkkuLader() + " | " + "Treibstoff: "+((Hybrid) x).getTreibstoff());
			}
				
		}
	}
	
	public static void ShowElektromotorsFahrzeug()
	{
		for(Fahrzeug e : listFahrzeug)
		{
			if(e instanceof Elektromotor)
			{
				Main.Printer("Marke: "+((Elektromotor)e).getMarke()+ " | "+"Abschreibungsdauer: "+((Elektromotor)e).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Elektromotor)e).getKaufdatum()+" | "+"Monatliche Kosten: "+((Elektromotor)e).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Elektromotor)e).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Elektromotor)e).getMitarbeiter().getName()+" | "+"Akku Kapazität: "+((Elektromotor)e).getAkkuKapazitaet() + " | " +"Akku Lader: "+((Elektromotor)e).getAkkuLader());
			}
		}
	}
	
	public static void ShowKraftmotorsFahrzeug()
	{
		for(Fahrzeug k : listFahrzeug)
		{
			if(k instanceof Kraftmotor)
			{
				Main.Printer("Marke: "+((Kraftmotor)k).getMarke()+ " | "+"Abschreibungsdauer: "+((Kraftmotor)k).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Kraftmotor)k).getKaufdatum()+" | "+"Monatliche Kosten: "+((Kraftmotor)k).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Kraftmotor)k).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Kraftmotor)k).getMitarbeiter().getName()+" | "+"Treibstoff: "+((Kraftmotor)k).getTreibstoff());
			}
		}
	}
	
	public static void ShowHybridFahrzeug()
	{
		for(Fahrzeug h : listFahrzeug)
		{
			if(h instanceof Hybrid)
			{
				Main.Printer("Marke: "+((Hybrid)h).getMarke()+ " | "+"Abschreibungsdauer: "+((Hybrid)h).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Hybrid)h).getKaufdatum()+" | "+"Monatliche Kosten: "+((Hybrid)h).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Hybrid)h).getWagenKategorie()+" | "+"Mitarbeiter Name: "+((Hybrid)h).getMitarbeiter().getName()+" | "+"Akku Kapazität: "+((Hybrid)h).getAkkuKapazitaet() + " | " +"Akku Lader: "+((Hybrid)h).getAkkuLader() + " | " +"Treibstoff: "+((Hybrid) h).getTreibstoff());
			}
		}
	}
	
	public static void ShowTransportFahrzeug()
	{
		for(Fahrzeug t : listFahrzeug)
		{
			if(t instanceof Transportfahrzeug)
			{
				Main.Printer("Marke: "+((Transportfahrzeug)t).getMarke()+ " | "+"Abschreibungsdauer: "+((Transportfahrzeug)t).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Transportfahrzeug)t).getKaufdatum()+" | "+"Monatliche Kosten: "+((Transportfahrzeug)t).getMonatlicheKosten()+" | "+"Fahrzeug Typ & Gewicht: "+((Transportfahrzeug)t).getTyp());
			}
		}
	}
	
	public static void ShowFlurfoerderFahrzeug()
	{
		for(Fahrzeug f : listFahrzeug)
		{
			if(f instanceof Flurfoerderzeug)
			{
				Main.Printer("Marke: "+((Flurfoerderzeug)f).getMarke()+ " | "+"Abschreibungsdauer: "+((Flurfoerderzeug)f).getAbschreibungsdauer()+" | "+"Kaufdatum: "+((Flurfoerderzeug)f).getKaufdatum()+" | "+"Monatliche Kosten: "+((Flurfoerderzeug)f).getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+((Flurfoerderzeug)f).getWagenKategorie() + " | " +"Produnktion Mitarbeiter Name:"+((Flurfoerderzeug)f).getProduktionMitarbeiter().getName());
			}
		}
	}
	
	public static void AddFahrzeug(Fahrzeug objekt)
	{
		listFahrzeug.add(objekt);
	}
	

}
