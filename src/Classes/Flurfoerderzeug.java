package Classes;

import java.util.Date;

public class Flurfoerderzeug extends Fahrzeug 
{
	private String wagenKategorie;
	private ProduktionMitarbeiter pm;
	
	public String getWagenKategorie() 
	{
		return wagenKategorie;
	}

	public ProduktionMitarbeiter getPm() 
	{
		return pm;
	}
	
	public Flurfoerderzeug(String marke,int abschreibungsDauer,Date kaufdatum,
			double monatlicheKosten, String wagen,ProduktionMitarbeiter pm)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= wagen;
		this.pm= pm;
	}

	

}

