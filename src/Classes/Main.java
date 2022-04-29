package Classes;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	static ArrayList<Fahrzeug> myList = new ArrayList<Fahrzeug>();

	public static void main(String[] args) 
	{
		ShowOptions("Data Zeigen","Data Einfugen");
		int x = GetMenuInput(2);
		if(x == 1)
			Printer("DATA HERE !!!");
		
		/*
		try
		{
			Scanner eingabeWert = new Scanner(System.in);
			if(!eingabeWert.hasNextInt());
			System.out.println("Bitte geben Sie ein digitale Number!");
			
		}
		catch(NumberFormatException ex)
		{
			Scanner eingabeWert = new Scanner(System.in);
		}
		*/
		Mitarbeiter k = new Mitarbeiter(1,"Khaled");
		Elektromotor elektromotor = new Elektromotor("Tesla",1,new Date(),233.44,"Elektro",k,500.00,"Super Charger");
		Kraftmotor karftmotor = new Kraftmotor("Toyota",2,new Date(),120.33,"Kraftmotor",k,"Gas");
		Hybrid hybrid = new Hybrid ("Tesla",1,new Date(),233.44,"Elektro",k,"Super Charger",500.00);
		
		AddFahrzeug(elektromotor);
		AddFahrzeug(karftmotor);
		AddFahrzeug(hybrid);
		
		
		
		
		ShowFahrzeug();
		
		
		
		
		
		
		
		/*ArrayList<Fahrzeug> myList = new ArrayList<Fahrzeug>();
		myList.add(elektroArt);
		myList.add(kraftArt);*/
		/*for(int i=0; i< myList.size(); i++) 
		{
			System.out.println(myList.get(i) + " ");
		}*/

				
		/*for(Fahrzeug item : myList)
		{
			System.out.println(item.getClass());
			if(item instanceof Elektromotor)
			{
				System.out.println("ELEKTROOOOOO");
			}
			if(item instanceof Kraftmotor)
			{
				System.out.println("ELEKTROOOOOO");
			}
		}*/
		 //System.out.println(myList.size());
	
	
	}
	
	
	public static void AddFahrzeug(Fahrzeug object)
	{
		myList.add(object);
	}
	
	public static void ShowFahrzeug()
	{
		for(Fahrzeug x : myList)
		{
			if(x instanceof Elektromotor)
			{
				Printer(((Elektromotor) x).getAkkuKapazitaet() + " " +((Elektromotor) x).getAkkuLader() + " ");
			}
			if(x instanceof Kraftmotor)
			{
				Printer(((Kraftmotor) x).getTreibstoff());
			}
			if(x instanceof Hybrid)
			{
				Printer(((Hybrid) x).getAkkuKapazitaet() + " " + ((Hybrid) x).getAkkuLader() + " ");
			}
				
		}
	}
	

	public static void Welcome()
	{
		Printer("Welcomme in unserer Fuhparkverwaltung");
		
		/*
		System.out.println("Möchten Sie \n 1: die Liste anschauen \n 2: In userem Fuhrparkverwaltung was neues reinlegen ?");
		System.out.println("Bitte geben Sie 1 oder 2 ein: ");
		*/
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
	public static int GetMenuInput(int max)
	{
		Printer("Bitte etwas von oben auswahlen [Only Digits]");
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
		
		Printer("Coool");
		return option;
		
	}
}
