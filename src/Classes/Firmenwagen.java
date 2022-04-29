package Classes;

import java.util.Date;

public abstract class Firmenwagen extends Fahrzeug{
	private String wagenKategorie;
	private Mitarbeiter mitarbeiter;
	
	public Firmenwagen(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten, String wagen, Mitarbeiter mitarbeiter)
	  {
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= wagen;
		this.mitarbeiter= mitarbeiter;
	  }

}
