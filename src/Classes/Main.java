package Classes;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.ENUMS.HasSchein;
import Classes.ENUMS.TransportTyp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Main {
	
	

	public static void main(String[] args) 
	{
		//Transportfahrzeug transport= new Transportfahrzeug("Tesla", 1, new Date(), 178.96, "Transport");
		//FahrzeugDataController.AddFahrzeug(transport);
		//CreateTransport();
		//FahrzeugDataController.ShowTransportFahrzeug();
		
		
		/*Date x = GetDateInput();
		System.out.println(x);*/
		/*double y = GetDoubleInput();
		System.out.println(y);*/
		
		Mitarbeiter k = new Mitarbeiter("Khaled");
		ProduktionMitarbeiter N = new ProduktionMitarbeiter ("Nagham", true);

		MitarbeiterDataController.AddMitarbeiter(k);
		MitarbeiterDataController.AddMitarbeiter(N);
		/*
		Mitarbeiter k = new Mitarbeiter(1,"Khaled");
		ProduktionMitarbeiter N = new ProduktionMitarbeiter (1,"Nagham", true);
		
		Transportfahrzeug transport= new Transportfahrzeug("Tesla", 1, new Date(), 178.96, "Transport");
		Flurfoerderzeug flur = new Flurfoerderzeug("Tesla", 1, new Date(), 190.50, "Hubwagen", N);
		Elektromotor elektromotor = new Elektromotor("Tesla",1,new Date(),233.44,"Elektro",k,500.00,"Super Charger");
		Kraftmotor karftmotor = new Kraftmotor("Toyota",2,new Date(),120.33,"Kraftmotor",k,"Gas");
		Hybrid hybrid = new Hybrid ("Tesla",1,new Date(),233.44,"Hybrid",k,"Super Charger",500.00,"Benzin");
		
		//Test mitarbeiter
		MitarbeiterDataController.AddMitarbeiter(k);
		MitarbeiterDataController.AddMitarbeiter(N);
		
		MitarbeiterDataController.ShowAllMitarbeiter();
		MitarbeiterDataController.ShowMitarbeiter();
		MitarbeiterDataController.ShowProduktionMitarbeiter();
		
		MitarbeiterDataController.ShowAllMitarbeiter();
		
		
		//Test fahrzeug
		FahrzeugDataController.AddFahrzeug(transport);
		FahrzeugDataController.AddFahrzeug(flur);
		FahrzeugDataController.AddFahrzeug(elektromotor); 
		FahrzeugDataController.AddFahrzeug(karftmotor); 
		FahrzeugDataController.AddFahrzeug(hybrid);
						
		FahrzeugDataController.ShowAllFahrzeuge();
		
		FahrzeugDataController.ShowHybridFahrzeug();
		FahrzeugDataController.ShowKraftmotorsFahrzeug();
		FahrzeugDataController.ShowElektromotorsFahrzeug();
		FahrzeugDataController.ShowFlurfoerderFahrzeug();
		FahrzeugDataController.ShowTransportFahrzeug();
		*/
		
		
		//MitarbeiterDataController.ShowAllMitarbeiter();
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
	}
	
	
	
	
	private static void CreateTransport()
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
		/*int choice = GetIntInput(4);
		if(choice == 1)
		{
			typ=(ENUMS.TransportTyp.KLEIN.toString());
		}
		
	    else if(choice == 2)
		{
			typ=(ENUMS.TransportTyp.LEICHT_1.toString());
		}
	    else if(choice == 3)
		{
			typ=(ENUMS.TransportTyp.LEICHT_2.toString());
		}
	    else if(choice == 4)
		{
			typ=(ENUMS.TransportTyp.MITTEL.toString());
		}*/
		
		Transportfahrzeug temp = new Transportfahrzeug(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,typ);
		FahrzeugDataController.AddFahrzeug(temp);
		
	}
	
	
	private static Date GetDateInput()
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
	
	
	
	private static void CreateMitarbeiter()
	{
		//Mitarbeiter Fields
		String name;
		
		Printer("To Create Mitarbeiter you need to fill the follwing field");
		Printer("Please Enter Name: ");
		name = GetStringInput();

		Mitarbeiter temp = new Mitarbeiter(name);
		MitarbeiterDataController.AddMitarbeiter(temp);
		Printer("You have added new Mitarbeiter");
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
	public static int GetIntInput(int max)
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
