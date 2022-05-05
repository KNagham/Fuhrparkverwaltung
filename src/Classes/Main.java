package Classes;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.ENUMS.ElektromotorAkkuLader;
import Classes.ENUMS.HasSchein;
import Classes.ENUMS.KraftmotorTreibstoff;
import Classes.ENUMS.TransportTyp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Main {
	
	

	public static void main(String[] args) 
	{
		ProduktionMitarbeiter n = new ProduktionMitarbeiter ("Nagham", true);
		ProduktionMitarbeiter e = new ProduktionMitarbeiter ("Emy", false);
		Mitarbeiter k = new Mitarbeiter("Khaled");
		
		MitarbeiterDataController.AddMitarbeiter(n);
		MitarbeiterDataController.AddMitarbeiter(e);
		MitarbeiterDataController.AddMitarbeiter(k);
		
		
		Transportfahrzeug transport= new Transportfahrzeug("Tesla", 1, new Date(), 178.96, "Transport");
		Flurfoerderzeug flur = new Flurfoerderzeug("Tesla", 1, new Date(), 190.50, n, 190.5, true);
		Elektromotor elektromotor = new Elektromotor("Tesla",1,new Date(),233.44,k,500.00,"Super Charger");
		Kraftmotor karftmotor = new Kraftmotor("Toyota",2,new Date(),120.33,k,"Gas");
		Hybrid hybrid = new Hybrid ("Tesla",1,new Date(),233.44,k,500.00,"Super Charger","Benzin");
		
		FahrzeugDataController.AddFahrzeug(transport);
		FahrzeugDataController.AddFahrzeug(flur);
		FahrzeugDataController.AddFahrzeug(elektromotor);
		FahrzeugDataController.AddFahrzeug(karftmotor);
		FahrzeugDataController.AddFahrzeug(hybrid);
	
		//CreateTransport();
		//FahrzeugDataController.ShowTransportFahrzeug();
		
		//CreateElektromotor();
		//FahrzeugDataController.ShowElektromotorsFahrzeug();
		
		//CreateHybrid();
		//FahrzeugDataController.ShowHybridFahrzeug();
		
		//CreateKraftmotor();
		//FahrzeugDataController.ShowKraftmotorsFahrzeug();

		//CreateFlurfoerderzeug();

		//Test mitarbeiter
		
		/*MitarbeiterDataController.ShowMitarbeiter();
		  MitarbeiterDataController.ShowProduktionMitarbeiter();
		  MitarbeiterDataController.ShowAllMitarbeiter();
		*/
		//Test fahrzeug
		/*
		FahrzeugDataController.ShowAllFahrzeuge();
		FahrzeugDataController.ShowHybridFahrzeug();
		FahrzeugDataController.ShowKraftmotorsFahrzeug();
		FahrzeugDataController.ShowElektromotorsFahrzeug();
		FahrzeugDataController.ShowFlurfoerderFahrzeug();
		FahrzeugDataController.ShowTransportFahrzeug();
		*/
		Welcome();
		MenuSystem.ProgramLoop();
	}
	
	public static void CreateMitarbeiter()
	{
		//Mitarbeiter Fields
		String name;
		
		Printer("To Create Mitarbeiter you need to fill the follwing field");
		Printer("Please Enter Name: ");
		name = GetStringInput();

		Mitarbeiter temp = new Mitarbeiter(name);
		MitarbeiterDataController.AddMitarbeiter(temp);
		Printer("You have added new Mitarbeiter");
		Printer("ID: "+temp.getId() + " | " +"Name: "+temp.getName());
	}
	
	public static void CreateProduktionMitarbeiter()
	{
		String name;
		boolean hasSchein;
		Printer("To Create Mitarbeiter you need to fill the follwing field");
		
		
		Printer("Please Enter Name: ");
		name = GetStringInput();
		
		
		Printer("Please Select of the Followin: ");
		
		int counter = 1;
		for(var x : HasSchein.values())
		{
			System.out.println(counter + ". " + x.toString());
			counter++;
		}
		
		
		hasSchein = GetIntInput(2) == 1 ? true : false;
		
		ProduktionMitarbeiter temp = new ProduktionMitarbeiter(name,hasSchein);
		MitarbeiterDataController.AddMitarbeiter(temp);
		Printer("You have added ProduktionMitarbeiter");
		Printer("ID: "+temp.getId()+ " | " +"Name: "+temp.getName()+ " | "+ (temp.isStaplerschein() ? HasSchein.JA : HasSchein.NEIN ));
	}
	
	public static void CreateTransport()
	{
		// benötigte Attribute 
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		String typ;
		Printer("To Create Transport you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
		
		Printer("Wählen Sie eine LKW Typ aus: ");
		int counter = 1;
		for(var x : TransportTyp.values())
		{
			System.out.println(counter + ". " + x.toString());
			counter++;
		}
		typ = ENUMS.TransportTyp.values()[GetIntInput(4) - 1].toString();
		Transportfahrzeug temp = new Transportfahrzeug(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,typ);
		FahrzeugDataController.AddFahrzeug(temp);
		Printer("Marke: "+temp.getMarke()+ " | "+"Abschreibungsdauer: "+temp.getAbschreibungsdauer()+" | "+"Kauf Datum: "+temp.getKaufdatum()+" | "+"Monatliche Kosten: "+temp.getMonatlicheKosten()+" | "+"Fahrzeug Typ & Gewicht: "+temp.getTyp());
		
	}
	
	public static void CreateFlurfoerderzeug()
	{
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		ProduktionMitarbeiter produktionMitarbeiter = null;
		double maxGewicht;
		boolean istMotorisiert;

		Printer("To Create Flurförderzeug you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
	
		Printer("Enter MaxGewischt in Ton:");
		maxGewicht = GetDoubleInput();
		
		Printer("Wählen Sie den Flurforederzeugtyp aus");
		ShowOptions("Motorisiert","Nicht Motorisiert");
		istMotorisiert = GetIntInput(2) == 1 ? true : false;
		
		Printer("Wählen Sie ID des ProduktionMitarbeiter aus: ");
        ArrayList<ProduktionMitarbeiter> tempList = MitarbeiterDataController.getListProduktionMitarbeiter();
        boolean found = false;
        while(produktionMitarbeiter == null)
        {
            MitarbeiterDataController.ShowProduktionMitarbeiter();
            int choice = GetIntInput();
            for(ProduktionMitarbeiter tempMitarbieter : tempList)
            {
                if(tempMitarbieter.getId() == choice && tempMitarbieter instanceof ProduktionMitarbeiter)
                {
                	if(istMotorisiert && tempMitarbieter.isStaplerschein() || !istMotorisiert) 
                	{
                    	produktionMitarbeiter = tempMitarbieter;
                        found = true;
                        break;
                	}
                }
            }
            if(!found && !istMotorisiert)
            {
                Printer("Please Select correct mitarbeiter");
            }
            if(!found && istMotorisiert)
            {
                Printer("Please Select correct mitarbeiter, der schein hat");
            }
	    }	
		Flurfoerderzeug temp = new Flurfoerderzeug(marke, abschreibungsDauer, kaufdatum, monatlicheKosten, produktionMitarbeiter, maxGewicht, found);
		FahrzeugDataController.AddFahrzeug(temp);
		Printer("Marke: "+temp.getMarke()+ " | "+"Abschreibungsdauer: "+temp.getAbschreibungsdauer()+" | "+"Kauf Datum: "+temp.getKaufdatum()+" | "+"Monatliche Kosten: "+temp.getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+temp.getWagenKategorie() + " | " +"Produktion Mitarbeiter Name: "+temp.getProduktionMitarbeiter().getName());
	}
	
	public static void CreateElektromotor()
	{
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		Mitarbeiter mitarbeiter = null;
		double akkuKapazitaet;
		String akkuLader;
		
		Printer("To Create Elektromotor you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
		
		Printer("Wählen Sie ID des Mitarbeiter aus: ");
        ArrayList<Mitarbeiter> tempList = MitarbeiterDataController.getListMitarbeiter();
        boolean found = false;
        while(mitarbeiter == null)
        {
            MitarbeiterDataController.ShowMitarbeiter();
            int choice = GetIntInput();
            for(Mitarbeiter tempMitarbieter : tempList)
            {
                if(tempMitarbieter.getId() == choice && tempMitarbieter instanceof Mitarbeiter && !(tempMitarbieter instanceof ProduktionMitarbeiter) )
                {
                    mitarbeiter = tempMitarbieter;
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                Printer("Please Select correct mitarbeiter");
            }
	    }	
	    
   	     Printer("Enter die AkkuKapazität : ");
	     akkuKapazitaet = GetDoubleInput();
	    
	     Printer("Wählen Sie den AkkuLader aus: ");
	     int counter = 1;
	     for(var x : ElektromotorAkkuLader.values())
		 {
			System.out.println(counter + ". " + x.toString());
			counter++;
		 }
	     akkuLader = ENUMS.ElektromotorAkkuLader.values()[GetIntInput(4) - 1].toString();
		 Elektromotor temp = new Elektromotor(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,mitarbeiter,akkuKapazitaet,akkuLader);
		 FahrzeugDataController.AddFahrzeug(temp);
		 Printer("Marke: "+temp.getMarke()+" | "+"Abschreibungsdauer: "+temp.getAbschreibungsdauer()+" | "+"Kauf Datum: "+temp.getKaufdatum()+" | "+"Monatliche Kosten: "+temp.getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+temp.getWagenKategorie()+" | "+"Mitarbeiter Name: "+temp.getMitarbeiter().getName()+" | "+"Akku Kapazität: "+temp.getAkkuKapazitaet() + " | " +"Akku Lader: "+temp.getAkkuLader());
	}
				
	public static void CreateKraftmotor()
	{
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		Mitarbeiter mitarbeiter = null;
		String treibstoff;
		
		Printer("To Create Kraftmotor you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
		
		Printer("Wählen Sie ID des Mitarbeiter aus: ");
        ArrayList<Mitarbeiter> tempList = MitarbeiterDataController.getListMitarbeiter();
        boolean found = false;
        while(mitarbeiter == null)
        {
            MitarbeiterDataController.ShowMitarbeiter();
            int choice = GetIntInput();
            for(Mitarbeiter tempMitarbieter : tempList)
            {
                if(tempMitarbieter.getId() == choice && tempMitarbieter instanceof Mitarbeiter && !(tempMitarbieter instanceof ProduktionMitarbeiter) )
                {
                    mitarbeiter = tempMitarbieter;
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                Printer("Please Select correct mitarbeiter");
            }
        }
        
        Printer("Wählen Sie den Treibstoff aus: ");
	     int counter = 1;
	     for(var x : KraftmotorTreibstoff.values())
		 {
			System.out.println(counter + ". " + x.toString());
			counter++;
		 }
	     treibstoff = ENUMS.KraftmotorTreibstoff.values()[GetIntInput(3) - 1].toString();
	     Kraftmotor temp = new Kraftmotor(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,mitarbeiter,treibstoff);
		 FahrzeugDataController.AddFahrzeug(temp);
		 Printer("Marke: "+temp.getMarke()+ " | "+"Abschreibungsdauer: "+temp.getAbschreibungsdauer()+" | "+"Kauf Datum: "+temp.getKaufdatum()+" | "+"Monatliche Kosten: "+temp.getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+temp.getWagenKategorie()+" | "+"Mitarbeiter Name: "+temp.getMitarbeiter().getName()+" | "+"Treibstoff: "+temp.getTreibstoff());
	}
	
	public static void CreateHybrid()
	{
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		Mitarbeiter mitarbeiter= null;
		String akkuLader;
		double akkuKapazitaet;
		String treibstoff;
		
		Printer("To Create Hybrid you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
		
		Printer("Wählen Sie ID des Mitarbeiter aus: ");
        ArrayList<Mitarbeiter> tempList = MitarbeiterDataController.getListMitarbeiter();
        boolean found = false;
        while(mitarbeiter == null)
        {
            MitarbeiterDataController.ShowMitarbeiter();
            int choice = GetIntInput();
            for(Mitarbeiter tempMitarbieter : tempList)
            {
                if(tempMitarbieter.getId() == choice && tempMitarbieter instanceof Mitarbeiter && !(tempMitarbieter instanceof ProduktionMitarbeiter) )
                {
                    mitarbeiter = tempMitarbieter;
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                Printer("Please Select correct Mitarbeiter");
            }
	    }	
	    
   	     Printer("Wählen Sie den AkkuLader aus: ");
	     int counter = 1;
	     for(var x : ElektromotorAkkuLader.values())
		 {
			System.out.println(counter + ". " + x.toString());
			counter++;
		 }
	     akkuLader = ENUMS.ElektromotorAkkuLader.values()[GetIntInput(4) - 1].toString();
	     
	     Printer("Enter die AkkuKapazität : ");
	     akkuKapazitaet = GetDoubleInput();
	    	     
	     Printer("Wählen Sie den Treibstoff aus: ");
	     int conter = 1;
	     for(var x : KraftmotorTreibstoff.values())
		 {
			System.out.println(conter + ". " + x.toString());
			conter++;
		 }
	     treibstoff = ENUMS.KraftmotorTreibstoff.values()[GetIntInput(3) - 1].toString();
		 Hybrid temp = new Hybrid(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,mitarbeiter,akkuKapazitaet,akkuLader,treibstoff);
		 FahrzeugDataController.AddFahrzeug(temp);
		 Printer("Marke: "+temp.getMarke()+ " | "+"Abschreibungsdauer: "+temp.getAbschreibungsdauer()+" | "+"Kauf Datum: "+temp.getKaufdatum()+" | "+"Monatliche Kosten: "+temp.getMonatlicheKosten()+" | "+"Fahrzeug Typ: "+temp.getWagenKategorie()+" | "+"Mitarbeiter Name: "+temp.getMitarbeiter().getName()+" | "+"Akku Kapazität: "+temp.getAkkuKapazitaet()+ " | " +"Akku Lader: "+temp.getAkkuLader() + " | " +"Treibstoff: "+temp.getTreibstoff());
	}
	
	
	public static void Welcome()
	{
		Printer("Welcomme in unserer Fuhparkverwaltung");
		Printer("Bitte wählen Sie aus: ");
	}
	
	public static int GetIntInput()
	{
		Scanner scanner = new Scanner(System.in);
		Integer option = null;
		String input;
		
		while(option == null)
		{
			Printer("Bitte geben Sie ein digitale Number!");
			input = scanner.next();
			try {
				option = Integer.class.isInstance(Integer.parseInt(input)) ? Integer.parseInt(input) >= 0 ? Integer.parseInt(input) : null : null; 
			}
			catch(Exception e)
			{
				
			}
		}
		return option;	
	}
	
	public static int GetIntInput(int max)
	{
		//Printer("Bitte etwas von oben auswahlen [Only Digits]");
		Scanner scanner = new Scanner(System.in);
		Integer option = null;
		String input;
		
		while(option == null)
		{
			Printer("Bitte geben Sie ein digitale Number!");
			input = scanner.next();
			try {
				//option = Integer.class.isInstance(Integer.parseInt(input)) ? Integer.parseInt(input) : null;
				option = Integer.class.isInstance(Integer.parseInt(input)) ? 
						Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= max ? 
								Integer.parseInt(input) : null : null; 
			}
			catch(Exception e)
			{
				
			}
		}
		return option;
	}
	
	public static double GetDoubleInput()
	{
		Scanner scanner = new Scanner(System.in);
		double option = 0;
		String input;
		
		while(option == 0)
		{
			input = scanner.next();
			try {
				option = Double.class.isInstance(Double.parseDouble(input)) ? Double.parseDouble(input) >= 0 ? Double.parseDouble(input) : null : null; 
			}
			catch(Exception e)
			{
				
			}
		}
		return option;
		
	}
	
	public static String GetStringInput()
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}
	
	public static Date GetDateInput()
	{
		Scanner scanner = new Scanner(System.in);
		Date date = null;
		String input;
		SimpleDateFormat sdtF = new SimpleDateFormat("dd.MM.yyyy",Locale.GERMANY);
		while(date == null)
		{
			Printer("Date format: 01.01.1970");
			input = scanner.next();
			try
			{
				date = sdtF.parse(input);
			}
			catch(Exception e)
			{
				
			}
		}
		return date;
	}	
	
	public static void ShowOptions()
	{
		Printer("0. Zuruck");
	}
	
	public static void ShowOptions(String s1, String s2)
	{
		Printer("1. "+s1);
		Printer("2. "+s2);
		Printer("0. Zuruck");
	}
	
	public static void ShowOptions(String s1, String s2, String s3)
	{
		Printer("1. "+s1);
		Printer("2. "+s2);
		Printer("3. "+s3);
		Printer("0. Zuruck");
	}
	
	public static void ShowOptions(String s1, String s2, String s3,String s4)
	{
		Printer("1. "+s1);
		Printer("2. "+s2);
		Printer("3. "+s3);
		Printer("4. "+s4);
		Printer("0. Zuruck");
	}
	
	public static void Printer(String s)
	{
		System.out.println(s);
	}
	
}
