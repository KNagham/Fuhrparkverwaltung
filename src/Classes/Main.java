package Classes;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	

	public static void main(String[] args) 
	{

		Mitarbeiter k = new Mitarbeiter(1,"Khaled");
		ProduktionMitarbeiter N = new ProduktionMitarbeiter (1,"Nagham", true);
		
		Transportfahrzeug transport= new Transportfahrzeug("Tesla", 1, new Date(), 178.96, "Transport", 250.21);
		Flurfoerderzeug flur = new Flurfoerderzeug("Tesla", 1, new Date(), 190.50, "Flur", N);
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
