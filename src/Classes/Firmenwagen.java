package Classes;

import java.util.Date;

public abstract class Firmenwagen extends Fahrzeug
{
	private String wagenKategorie;
	private Mitarbeiter mitarbeiter;
	
	public String getWagenKategorie() 
	{
		return wagenKategorie;
	}

	public Mitarbeiter getMitarbeiter() 
	{
		return mitarbeiter;
	}
	
	public Firmenwagen(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten, String wagen, Mitarbeiter mitarbeiter)
	  {
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= wagen;
		this.mitarbeiter= mitarbeiter;
	  }

}
