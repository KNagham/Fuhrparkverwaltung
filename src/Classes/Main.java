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
		ProduktionMitarbeiter N = new ProduktionMitarbeiter ("Nagham", true);
		ProduktionMitarbeiter E = new ProduktionMitarbeiter ("Emy", false);
		Mitarbeiter k = new Mitarbeiter("Khaled");
		
		MitarbeiterDataController.AddMitarbeiter(N);
		MitarbeiterDataController.AddMitarbeiter(E);
		MitarbeiterDataController.AddMitarbeiter(k);
		
		
		Transportfahrzeug transport= new Transportfahrzeug("Tesla", 1, new Date(), 178.96, "Transport");
		Flurfoerderzeug flur = new Flurfoerderzeug("Tesla", 1, new Date(), 190.50, N, 190.5, true);
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
		/*Date x = GetDateInput();
		System.out.println(x);*/
		/*double y = GetDoubleInput();
		System.out.println(y);*/
		
		
		
		
		//CreateFlurfoerderzeug();
		
		
		
		
		
		
		//Test mitarbeiter
		
		/*
		MitarbeiterDataController.ShowAllMitarbeiter();
		MitarbeiterDataController.ShowMitarbeiter();
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
		
		
		//MitarbeiterDataController.ShowAllMitarbeiter();
		/*
		while(true)
		{
			ShowOptions("Add Mitarbeiter","Add Produktionmitarbeiter");
			int choice = GetIntInput(2);
			if(choice == 1)
			{
				CreateMitarbeiter();
			}
			if(choice==2)
			{
				CreateProduktionMitarbeiter();
			}
			MitarbeiterDataController.ShowAllMitarbeiter();
		}
		*/
		MenuSystem.ProgramLoop();
	}
	
	

	
	public static void CreateFlurfoerderzeug()
	{
		String marke;
		int abschreibungsDauer;
		Date kaufdatum;
		double monatlicheKosten;
		
		ProduktionMitarbeiter produktionMitarbeiter = null;
		double maxGewischt;
		boolean istMotorisiert;
		
		
		Printer("To Create Flurfoerderzeug you need to fill the following field");
		
		Printer("Enter Marke: ");
		marke = GetStringInput();
		
		Printer("Enter die Abschreibungsdauer: ");
		abschreibungsDauer = GetIntInput();
		
		Printer("Enter den Kaufdatum: ");
		kaufdatum = GetDateInput();
		
		Printer("Enter die monatliche Kosten : ");
		monatlicheKosten = GetDoubleInput();
		

		
		Printer("Enter MaxGewischt in Ton:");
		maxGewischt = GetDoubleInput();
		
		
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
		Flurfoerderzeug temp = new Flurfoerderzeug(marke, abschreibungsDauer, kaufdatum, maxGewischt, produktionMitarbeiter, maxGewischt, found);
		FahrzeugDataController.AddFahrzeug(temp);
		Printer(temp.getMarke()+ " "+temp.getAbschreibungsdauer()+" "+temp.getKaufdatum()+" "+temp.getMonatlicheKosten()+" "+temp.getWagenKategorie() + " " +temp.getPm().getName());
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
		 Printer(temp.getMarke()+ " "+temp.getAbschreibungsdauer()+" "+temp.getKaufdatum()+" "+temp.getMonatlicheKosten()+" "+temp.getWagenKategorie()+" "+temp.getMitarbeiter().getName()+" "+temp.getAkkuKapazitaet() + " " +temp.getAkkuLader() + " ");
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
		Printer(temp.getMarke()+ " "+temp.getAbschreibungsdauer()+" "+temp.getKaufdatum()+" "+temp.getMonatlicheKosten()+" "+temp.getTyp());
		
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
		 Printer(temp.getMarke()+ " "+temp.getAbschreibungsdauer()+" "+temp.getKaufdatum()+" "+temp.getMonatlicheKosten()+" "+temp.getWagenKategorie()+" "+temp.getMitarbeiter().getName()+" "+temp.getTreibstoff());
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
		 Printer(temp.getMarke()+ " "+temp.getAbschreibungsdauer()+" "+temp.getKaufdatum()+" "+temp.getMonatlicheKosten()+" "+temp.getWagenKategorie()+" "+temp.getMitarbeiter().getName()+" "+temp.getAkkuKapazitaet() + " " +temp.getAkkuLader() + " " +temp.getTreibstoff());
	}
	
	public static Date GetDateInput()
	{
		Scanner eingabeWert = new Scanner(System.in);
		Date date = null;
		String input;
		SimpleDateFormat sdtF = new SimpleDateFormat("dd.MM.yyyy",Locale.GERMANY);
		while(date == null)
		{
			Printer("Date format: 01.01.1970");
			input = eingabeWert.next();
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
	
	public static double GetDoubleInput()
	{
		Scanner eingabeWert = new Scanner(System.in);
		double option = 0;
		String input;
		
		while(option == 0)
		{
			input = eingabeWert.next();
			try {
				option = Double.class.isInstance(Double.parseDouble(input)) ? Double.parseDouble(input) >= 0 ? Double.parseDouble(input) : null : null; 
			}
			catch(Exception e)
			{
				
			}
		}
		return option;
		
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
		Printer(temp.getId() + " " + temp.getName());
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
		Printer(temp.getId() + " " + temp.getName()+ " "+ (temp.isStaplerschein() ? HasSchein.JA : HasSchein.NEIN ));
	}

	public static void Welcome()
	{
		Printer("Welcomme in unserer Fuhparkverwaltung");
	}
	
	public static void Printer(String s)
	{
		System.out.println(s);
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
	
	//Input system
	
	//Int input for menu
	static int GetIntInput(int max)
	{
		//Printer("Bitte etwas von oben auswahlen [Only Digits]");
		Scanner eingabeWert = new Scanner(System.in);
		Integer option = null;
		String input;
		
		while(option == null)
		{
			Printer("Bitte geben Sie ein digitale Number!");
			input = eingabeWert.next();
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
	
	public static int GetIntInput()
	{
		//Printer("Bitte etwas von oben auswahlen [Only Digits]");
		Scanner eingabeWert = new Scanner(System.in);
		Integer option = null;
		String input;
		
		while(option == null)
		{
			Printer("Bitte geben Sie ein digitale Number!");
			input = eingabeWert.next();
			try {
				option = Integer.class.isInstance(Integer.parseInt(input)) ? Integer.parseInt(input) >= 0 ? Integer.parseInt(input) : null : null; 
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		return option;
		
	}
	
	public static String GetStringInput()
	{
		Scanner eingabeWert = new Scanner(System.in);
	
		String input = eingabeWert.next();
		
		return input;
	}
}
